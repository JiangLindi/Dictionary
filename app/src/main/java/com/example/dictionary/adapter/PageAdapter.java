package com.example.dictionary.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dictionary.fragments.ChooseBookFragment;
import com.example.dictionary.fragments.ReviewFragment;
import com.example.dictionary.fragments.SettingFragment;
import com.example.dictionary.fragments.StatisticFragment;

import java.util.HashMap;

public class PageAdapter extends FragmentPagerAdapter {
    private int num;
    private HashMap<Integer, Fragment> mFragmentHashMap = new HashMap<>();
    public PageAdapter(FragmentManager fm, int num) {
        super(fm);
        this.num = num;
    }

    @Override
    public Fragment getItem(int position) {
        return createFragment(position);
    }

    @Override
    public int getCount() {
        return num;
    }

    private Fragment createFragment(int pos) {
        Fragment fragment = mFragmentHashMap.get(pos);

        if (fragment == null) {
            switch (pos) {
                case 0:
                    fragment = ReviewFragment.newInstance();
                    break;
                case 1:
                    fragment = ChooseBookFragment.newInstance();
                    break;
                case 2:
                    fragment = StatisticFragment.newInstance();
                    break;
                case 3:
                    fragment = SettingFragment.newInstance();
                    break;
            }
            mFragmentHashMap.put(pos, fragment);
        }
        return fragment;
    }
}