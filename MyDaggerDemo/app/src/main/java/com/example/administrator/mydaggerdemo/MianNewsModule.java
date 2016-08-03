package com.example.administrator.mydaggerdemo;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016-7-11.
 */
@Module
public class MianNewsModule {

    @Singleton
    @Provides
    public MainModel  provideMainNewsDetails(){
        return new MainModel();
    }

}
