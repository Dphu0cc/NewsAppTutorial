package com.phuoc.newsapptutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem nhome, nscience, nhealth, nentertainnment, nsports, ntech;
    PagerAdapter pagerAdapter;
    Toolbar ntoolbar;

    String ipa = "77209bd97d1d404d857df4e4f0052b26";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ntoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(ntoolbar);

        nhome = findViewById(R.id.home);
        nscience = findViewById(R.id.science);
        nhealth = findViewById(R.id.health);
        nentertainnment = findViewById(R.id.entertainment);
        nsports = findViewById(R.id.sports);
        ntech = findViewById(R.id.technology);

        ViewPager viewPager = findViewById(R.id.fragmentcontainer);
        tabLayout = findViewById(R.id.include);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 6);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1 ||tab.getPosition() == 2 ||tab.getPosition() == 3 ||tab.getPosition() == 4 ||tab.getPosition() == 5) {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}