package com.example.dictionary.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dictionary.R;

public class StatisticFragment extends Fragment {
    public StatisticFragment(){

    }
    public static StatisticFragment newInstance(){
        StatisticFragment fragement=new StatisticFragment();
        return fragement;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fragment_statistic, container, false);
        return view;
    }

}
