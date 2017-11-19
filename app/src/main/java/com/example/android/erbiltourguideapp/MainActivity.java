package com.example.android.erbiltourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager vp = (ViewPager) findViewById(R.id.view_pager);
        TabLayout tl = (TabLayout) findViewById(R.id.tab_layout);
        ErbilFragmentPageAdapter fragmentPageAdapter = new ErbilFragmentPageAdapter(getSupportFragmentManager(),this);
        vp.setAdapter(fragmentPageAdapter);
        tl.setupWithViewPager(vp);
    }
}
