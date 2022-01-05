package cn.alex.mvvmkotlin.fragment

import android.os.Bundle
import cn.alex.mvvmkotlin.R
import cn.alex.mvvmkotlin.custom.init
import cn.alex.mvvmkotlin.custom.initMain
import cn.alex.mvvmkotlin.databinding.FragmentBoxBinding
import cn.alex.mvvmkotlin.databinding.FragmentMainBinding
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
class MainFragment : BaseFragment<MainViewModel, FragmentMainBinding>() {

    override fun layoutId() = R.layout.fragment_main;

    override fun initView(savedInstanceState: Bundle?) {
//        task_tv.setText("tv");
        //初始化viewpager2
        mDatabind.mainViewpager.initMain(this)
        //初始化 bottomBar
        mDatabind.mainBottom.init{
            when (it) {
                R.id.menu_main -> mDatabind.mainViewpager.setCurrentItem(0, false)
                R.id.menu_task -> mDatabind.mainViewpager.setCurrentItem(1, false)
                R.id.menu_shop -> mDatabind.mainViewpager.setCurrentItem(2, false)
            }
        }
    }

}