package com.example.administrator.mydaggerdemo;

import com.github.aurae.retrofit2.LoganSquareConverterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-3-11
 */
public class RetrofitUtil {


    private static final RetrofitUtil instance = new RetrofitUtil();

    public static RetrofitUtil getInstance() {
        return instance;
    }

    public static Retrofit retrofit;

    public RetrofitUtil() {
        getLoganSquareRetrofit();
    }

    /**
     * 正式接口
     *
     * @return
     *
    public static Retrofit getRetrofit() {

        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(OkHttpUtil.getInstance().getOkHttpClient())
                    .baseUrl("http://api.bailitop.com/")
                    .build();
        }

        return retrofit;
    }
    */


    /**
     * 使用LoganSquare作为JONS解析器
     */
    public void getLoganSquareRetrofit() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        retrofit = new Retrofit.Builder()
                .client(OkHttpUtil.getInstance().getOkHttpClient())
//                .client(okHttpClient)
                .baseUrl("http://api.bailitop.com/")
                .addConverterFactory(LoganSquareConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

    }

    public <T> T create(Class<?> clazz) {
        return (T) retrofit.create(clazz);
    }


}
