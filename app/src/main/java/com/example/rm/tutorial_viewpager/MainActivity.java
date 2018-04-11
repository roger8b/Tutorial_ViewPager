package com.example.rm.tutorial_viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Passo 2
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Passo 3
        viewPager = findViewById(R.id.viewpager);

        //Passo 21 -
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);

        //Passo 22 -
        viewPager.setAdapter(adapter);
    }
}
