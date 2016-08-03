package com.example.administrator.mydaggerdemo;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016-7-11.
 */
public class MainModel {

    MainApi mainApi;


    @Inject
    public MainModel(){
        mainApi = RetrofitUtil.getInstance().create(MainApi.class);
    }

    public Subscription getHistory(String userid, String utype, String page, Observer<MainNewsDetails> observer){
        return mainApi.getHistoryListRx(userid,utype,page).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

}
