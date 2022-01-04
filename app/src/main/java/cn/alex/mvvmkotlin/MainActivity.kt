package cn.alex.mvvmkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.databinding.DataBindingUtil.setContentView
import cn.alex.mvvmkotlin.databinding.ActivityMainBinding
import cn.alex.mvvmkotlin.viewmodel.MainViewModel
import me.hgj.jetpackmvvm.base.activity.BaseVmDbActivity
import me.hgj.jetpackmvvm.demo.app.base.BaseActivity

class MainActivity() : BaseActivity<MainViewModel, ActivityMainBinding>() {


    override fun layoutId() = R.layout.activity_main

    override fun initView(savedInstanceState: Bundle?) {
    }

}