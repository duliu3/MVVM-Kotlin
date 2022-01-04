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

class MainActivity() : BaseActivity<MainViewModel, ActivityMainBinding>(), Parcelable {


    constructor(parcel: Parcel) : this() {
    }

    override fun layoutId() = R.layout.activity_main

    override fun initView(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}