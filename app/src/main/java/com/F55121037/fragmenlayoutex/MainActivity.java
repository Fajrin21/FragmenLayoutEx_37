package com.F55121037.fragmenlayoutex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appBar_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        viewpageadapter adapter = new viewpageadapter(getSupportFragmentManager());
        adapter.AddFragment(new fragmentHome(), "Home");
        adapter.AddFragment(new fragmentExplore(), "Explore");
        adapter.AddFragment(new fragmentAccount(), "Account");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}