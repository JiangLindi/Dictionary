package com.example.dictionary.utils;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.dictionary.R;
import com.example.dictionary.fragments.ChooseBookFragment;
import com.example.dictionary.fragments.ReviewFragment;
import com.example.dictionary.fragments.SettingFragment;
import com.example.dictionary.fragments.StatisticFragment;

public class FragmentGenerator {
    public static final String []mTabTitle=new String[]{"复习","选词","统计","设置"};
    public static final int []mTabImage=new int[]{R.drawable.tab_review_unselected,R.drawable.tab_book_unselected,R.drawable.tab_graph_unselected,R.drawable.tab_settings_unselected};

    public static Fragment[] getFragements()
    {

        Fragment fragments[] = new Fragment[4];
        fragments[0] = ChooseBookFragment.newInstance();
        fragments[1] = ReviewFragment.newInstance();
        fragments[2] = StatisticFragment.newInstance();
        fragments[3] = SettingFragment.newInstance();
        return fragments;

    }

    public static View getTabView(Context context, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_tab_content, null);
        ImageView tabIcon = (ImageView) view.findViewById(R.id.tab_image);
        tabIcon.setImageResource(mTabImage[position]);
        TextView tabText = (TextView) view.findViewById(R.id.tab_text);
        tabText.setText(mTabTitle[position]);
        return view;
    }


}
