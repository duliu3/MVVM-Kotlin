package cn.alex.mvvmkotlin.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import cn.alex.mvvmkotlin.R
import cn.alex.mvvmkotlin.databinding.FragmentBoxBinding
import cn.alex.mvvmkotlin.databinding.FragmentTaskBinding
import cn.alex.mvvmkotlin.viewmodel.BoxViewModel
import cn.alex.mvvmkotlin.viewmodel.MainViewModel
import me.hgj.jetpackmvvm.demo.app.base.BaseFragment
import me.hgj.jetpackmvvm.demo.app.event.TaskViewModel
import me.hgj.jetpackmvvm.demo.app.network.apiService
import me.hgj.jetpackmvvm.ext.nav
import me.hgj.jetpackmvvm.ext.navigateAction
import me.hgj.jetpackmvvm.ext.parseState
import me.hgj.jetpackmvvm.ext.request

/**
 * @author: liudu
 * @date: 2022/1/4
 * @desc:
 */
class BoxFragment : BaseFragment<BoxViewModel, FragmentBoxBinding>() {

    private val requestBoxViewModel: BoxViewModel by viewModels()

    override fun layoutId() = R.layout.fragment_box;

    override fun initView(savedInstanceState: Bundle?) {
        requestBoxViewModel.getBannerData()
//        task_tv.setText("tv");

        requestBoxViewModel.bannerData.observe(viewLifecycleOwner, Observer { resultState ->
            parseState(resultState, { data ->
                Log.d("box", "data $data");
            })
        })
    }



}