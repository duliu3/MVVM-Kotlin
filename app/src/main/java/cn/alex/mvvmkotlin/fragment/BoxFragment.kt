package cn.alex.mvvmkotlin.fragment

import android.os.Bundle
import cn.alex.mvvmkotlin.R
import cn.alex.mvvmkotlin.databinding.FragmentBoxBinding
import cn.alex.mvvmkotlin.databinding.FragmentTaskBinding
import cn.alex.mvvmkotlin.viewmodel.BoxViewModel
import cn.alex.mvvmkotlin.viewmodel.MainViewModel
import me.hgj.jetpackmvvm.demo.app.base.BaseFragment
import me.hgj.jetpackmvvm.demo.app.event.TaskViewModel

/**
 * @author: liudu
 * @date: 2022/1/4
 * @desc:
 */
class BoxFragment : BaseFragment<BoxViewModel, FragmentBoxBinding>() {

    override fun layoutId() = R.layout.fragment_box;

    override fun initView(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
//        task_tv.setText("tv");
    }

}