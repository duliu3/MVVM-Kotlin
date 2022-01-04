package me.hgj.jetpackmvvm.demo.app.event

import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.callback.livedata.event.EventLiveData

class EventViewModel : BaseViewModel() {

    //添加TODO通知
    val todoEvent = EventLiveData<Boolean>()

}