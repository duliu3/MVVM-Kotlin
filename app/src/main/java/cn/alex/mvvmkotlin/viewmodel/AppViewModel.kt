package me.hgj.jetpackmvvm.demo.app.event

import cn.alex.mvvmkotlin.bean.UserInfo
import com.kunminx.architecture.ui.callback.UnPeekLiveData
import me.hgj.jetpackmvvm.base.appContext
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.callback.livedata.event.EventLiveData

class AppViewModel : BaseViewModel() {

    //App的账户信息
    var userInfo = UnPeekLiveData.Builder<UserInfo>().setAllowNullValue(true).create()

    init {
        //默认值保存的账户信息，没有登陆过则为null
//        userInfo.value = CacheUtil.getUser()
    }
}