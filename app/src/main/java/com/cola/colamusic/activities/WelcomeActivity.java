package com.cola.colamusic.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.cola.colamusic.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 1. 延迟3秒
 * 2. 跳转界面
 */
public class WelcomeActivity extends BaseActivity {

    private static final String TAG = "WelcomeActivity";
    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        init();
    }

    private void init() {
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Log.e(TAG, "当前线程为：" + Thread.currentThread());
//                toMain();
                toLogin();
            }
        }, 3 * 1000);
    }

    private void toMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void toLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
