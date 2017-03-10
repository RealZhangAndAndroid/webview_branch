package com.cqccn.xwalkfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Real Zhang on 2017/3/6.
 */
public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }


    public void testwebrtc (View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url", "https://test.webrtc.org/");
        startActivity(intent);
    }


    public void html5test (View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url", "http://html5test.com/");
        startActivity(intent);
    }


    public void mobilehtml5 (View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url", "http://mobilehtml5.org/");
//        intent.putExtra("url", "https://www.baidu.com/");
        startActivity(intent);
    }
}
