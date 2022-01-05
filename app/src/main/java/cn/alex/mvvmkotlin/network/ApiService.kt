package cn.alex.mvvmkotlin.network

import cn.alex.mvvmkotlin.bean.BannerResponse
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface ApiService {

    companion object {
        const val SERVER_URL = "https://wanandroid.com/"
    }

/*

    @GET("xxx")
    suspend fun getXXX(): ApiResponse<ArrayList<XX>>

    @POST("")
    suspend fun postData(
        @Query("name") name: String,
        @Query("index") index: String
    ): ApiResponse<XX>

    @POST("/json")
    @FormUrlEncoded
    suspend fun doneTodo(@Path("id") id: Int, @Field("status") status: Int): ApiResponse<Any?>
*/

    @GET("banner/json")
    suspend fun getBanner(): ApiResponse<ArrayList<BannerResponse>>


}