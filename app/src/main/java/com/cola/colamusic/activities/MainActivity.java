package com.cola.colamusic.activities;

import android.os.Bundle;

import com.cola.colamusic.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        initNavBar(false, "可乐音乐", true);
    }


}