package com.example.administrator.mydaggerdemo;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2016-7-11.
 */
@Singleton
@Component(modules = MianNewsModule.class)
public interface HistoryComponent {

    void inject(MainActivity activity);

}
