package com.lkl.demo.https

import com.lkl.demo.bean.ResultData
import com.lkl.demo.bean.UserInfoVo
import io.reactivex.Observable
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created    likunlun
 * Time       2017/8/3 11:06
 * Desc	      网络请求接口
 */
interface ApiService {
    @POST("m/login")
    @FormUrlEncoded
    fun userLogin(@FieldMap options: Map<String, String>): Observable<ResultData<UserInfoVo>>
}