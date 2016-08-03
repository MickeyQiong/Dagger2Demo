package com.example.administrator.mydaggerdemo;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private HistoryComponent historyComponent;

    Subscription subscription;

    @Inject
    MainModel mainModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);

        historyComponent = DaggerHistoryComponent.builder().mianNewsModule(new MianNewsModule()).build();

        historyComponent.inject(this);

        getHistory1();
    }

    private void getHistory1() {
        subscription = mainModel.getHistory("999", "2", "1", new Observer<MainNewsDetails>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(MainNewsDetails mainNewsDetails) {
                textView.setText(mainNewsDetails.data.toString());

            }
        });
    }
}
