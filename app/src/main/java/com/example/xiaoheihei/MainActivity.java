package com.example.xiaoheihei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
     private LinearLayout linearlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearlayout = (LinearLayout) findViewById(R.id.linearlayoutid);
        linearlayout.addView(new MyResgionView(this));
    }
}
