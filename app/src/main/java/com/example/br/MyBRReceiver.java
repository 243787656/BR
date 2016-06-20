package com.example.br;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2016/6/15.
 */
public class MyBRReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            Log.d("测试--》》","进入了广播接收器111");
            //接收到发送方发送的任何广播
            String action = intent.getAction();
            if (action.equals("com")) {
                Log.d("测试--》》","静态广播接收到的信息：" + intent.getStringExtra("mess"));
            }
        } catch (Exception e) {
        }
    }
}
