package com.example.administrator.mydaggerdemo;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016-7-9.
 */
public interface MainApi {


    //历史记录
    //http://api.baili.com/appsite/v1/histories?userid=1&utype=1,,,userid=1&utype=1
    @GET("appsite/v1/histories")
    Observable<MainNewsDetails> getHistoryListRx(@Query("userid") String userid, @Query("utype") String utype, @Query("page") String page);
}
