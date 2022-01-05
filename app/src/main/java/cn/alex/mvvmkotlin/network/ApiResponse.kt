package cn.alex.mvvmkotlin.network

import me.hgj.jetpackmvvm.network.BaseResponse

data class ApiResponse<T>(val errorCode: Int, val errorMsg: String, val data: T) : BaseResponse<T>() {

    // TODO: 2022/1/5  根据服务器定义code
    override fun isSucces() = errorCode == 0

    override fun getResponseCode() = errorCode

    override fun getResponseData() = data

    override fun getResponseMsg() = errorMsg

}