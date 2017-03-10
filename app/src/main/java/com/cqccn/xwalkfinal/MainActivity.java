package com.cqccn.xwalkfinal;


import android.content.Intent;
import android.os.Bundle;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkView;

/**
 * Created by Real Zhang on 2017/3/6.
 */
public class MainActivity extends XWalkActivity {
    private XWalkView xWalkWebView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取这个Intent对象的Extra中对应键的值
        Intent intent = getIntent();
        url = intent.getStringExtra("url");


        xWalkWebView=(XWalkView)findViewById(R.id.xwalkWebView);
        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
    }

    @Override
    protected void onXWalkReady() {
//        xWalkWebView.load("https://www.baidu.com/", null);
//        xWalkWebView.load("mobilehtml5.org", null);
//        xWalkWebView.load("html5test.com", null);
        xWalkWebView.load(url, null);

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}