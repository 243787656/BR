package com.example.br;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    MyBRReceiver myReceiver;
    String ACTION="com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //核心部分代码：静态广播
        /*myReceiver = new MyBRReceiver();
        IntentFilter itFilter = new IntentFilter();
        itFilter.addAction(ACTION);
        registerReceiver(myReceiver, itFilter);*/
        Intent intent = new Intent();
        intent.setAction(ACTION);
        intent.putExtra("mess", "下午上课好累啊.....");
        sendBroadcast(intent);
    }
    //别忘了将广播取消掉哦~
    /*@Override
    protected void onDestroy() {
        unregisterReceiver(myReceiver);//注意........................
        super.onDestroy();
    }*/
}
