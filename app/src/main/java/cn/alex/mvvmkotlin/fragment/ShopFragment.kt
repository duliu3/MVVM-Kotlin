package cn.alex.mvvmkotlin.fragment

import android.os.Bundle
import cn.alex.mvvmkotlin.R
import cn.alex.mvvmkotlin.databinding.FragmentShopBinding
import cn.alex.mvvmkotlin.databinding.FragmentTaskBinding
import cn.alex.mvvmkotlin.viewmodel.MainViewModel
import me.hgj.jetpackmvvm.demo.app.base.BaseFragment
import me.hgj.jetpackmvvm.demo.app.event.ShopViewModel
import me.hgj.jetpackmvvm.demo.app.event.TaskViewModel

/**
 * @author: liudu
 * @date: 2022/1/4
 * @desc:
 */
class ShopFragment : BaseFragment<ShopViewModel, FragmentShopBinding>() {

    override fun layoutId() = R.layout.fragment_shop;

    override fun initView(savedInstanceState: Bundle?) {
//        task_tv.setText("tv");
    }

}