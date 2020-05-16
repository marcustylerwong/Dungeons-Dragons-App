package com.example.charactersheetapprevised;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       // spinner = findViewById(R.id.spinner1);

        //infoOneFragment = new ChatFragment();

        //ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(this, R.array.races, R.layout.support_simple_spinner_dropdown_item);


       // adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
       // spinner.setAdapter(adapter);

        //spinner.setOnItemClickListener(new AdapterView.OnItemSelectedListener());

        TabLayout tabLayout = findViewById(R.id.tabBar);
        TabItem tabChats = findViewById(R.id.tabChats);
        TabItem tabStatus = findViewById(R.id.tabStatus);
        TabItem tabCall = findViewById(R.id.tabCall);
        TabItem tabStats2 = findViewById(R.id.tabStats2);
        TabItem tabSpells = findViewById(R.id.tabSpellsItems);
        final ViewPager viewPager = findViewById(R.id.viewPager);

        PagerAdapter pagerAdapter = new
                PagerAdapter(getSupportFragmentManager(),
                    tabLayout.getTabCount());

                viewPager.setAdapter(pagerAdapter);

                tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        viewPager.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }



                    });

        //Context context = this;



    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}