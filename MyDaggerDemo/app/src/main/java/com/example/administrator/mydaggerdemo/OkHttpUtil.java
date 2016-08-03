package com.example.administrator.mydaggerdemo;


import okhttp3.OkHttpClient;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-3-11
 */
public class OkHttpUtil {

    private static OkHttpUtil mInstance;

    private OkHttpClient mOkHttpClient;

    private OkHttpUtil() {
        mOkHttpClient = initClient();
    }

    public static OkHttpUtil getInstance() {
        if (mInstance == null) {
            synchronized (OkHttpUtil.class) {
                if (mInstance == null) {
                    mInstance = new OkHttpUtil();
                }
            }
        }
        return mInstance;
    }

    public OkHttpClient getOkHttpClient(){
        if (mOkHttpClient == null){

            return mOkHttpClient;
        }

        return initClient();
    }

    public OkHttpClient initClient(){

        mOkHttpClient =  new OkHttpClient.Builder()
                //.addNetworkInterceptor(new StethoInterceptor())
                .build();
//        mOkHttpClient.newBuilder().connectTimeout(15, TimeUnit.SECONDS);
//        mOkHttpClient.newBuilder().readTimeout(15,TimeUnit.SECONDS);
//        mOkHttpClient.newBuilder().writeTimeout(15,TimeUnit.SECONDS);
//        mOkHttpClient.networkInterceptors().add(new StethoInterceptor());//这里添加了Stetho调试框架

        return mOkHttpClient ;
    }

    /**
     * 封装的方法放在下面
     */



}