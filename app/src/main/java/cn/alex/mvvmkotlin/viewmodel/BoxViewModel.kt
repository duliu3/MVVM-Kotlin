package cn.alex.mvvmkotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import cn.alex.mvvmkotlin.bean.BannerResponse
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.demo.app.network.apiService
import me.hgj.jetpackmvvm.ext.request
import me.hgj.jetpackmvvm.state.ResultState

/**
 * @author: liudu
 * @date: 2022/1/4
 * @desc:
 */
class BoxViewModel : BaseViewModel() {

    var bannerData: MutableLiveData<ResultState<ArrayList<BannerResponse>>> = MutableLiveData()

    fun getBannerData() {
        request({ apiService.getBanner() }, bannerData)
    }
}