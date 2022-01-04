package cn.alex.mvvmkotlin.bean
import android.annotation.SuppressLint
import android.os.Parcelable

@SuppressLint("ParcelCreator")
data class UserInfo(
                    var id: String="",
                    var nickname: String="",
                    var token: String="",
                    var type: Int =0,
                    var username: String="")
