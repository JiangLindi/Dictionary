package com.example.dictionary.activicty;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.dictionary.adapter.PageAdapter;
import com.example.dictionary.utils.FragmentGenerator;
import com.example.dictionary.R;

import java.util.Objects;

public class BottomTabActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private Fragment[] mFragments;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_tab);
        mFragments = FragmentGenerator.getFragements();
        initView();
    }
    public void initView() {

        tabLayout =findViewById(R.id.bottom_tab_layout);
        viewPager=findViewById(R.id.viewpage);
       viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),4));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setSelectedTabIndicatorColor(Color.rgb(0,0,255));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                for (int i=0;i<tabLayout.getTabCount();i++)
                {
                    View view = Objects.requireNonNull(tabLayout.getTabAt(i)).getCustomView();
                    assert view != null;
                    TextView textView=view.findViewById(R.id.tab_text);
                    if (i==tab.getPosition())
                    {
                        textView.setTextColor(Color.rgb(130,206,250));
                    }
                    else
                    {
                        textView.setTextColor(Color.rgb(0,0,0));
                    }
                }

            }
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        for(int i=0;i<4;i++){
            tabLayout.addTab(tabLayout.newTab().setCustomView(FragmentGenerator.getTabView(this,i)));
        }

    }
}
