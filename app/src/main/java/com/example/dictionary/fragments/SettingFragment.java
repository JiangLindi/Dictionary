package com.example.dictionary.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dictionary.R;

public class SettingFragment extends Fragment {

        public SettingFragment(){

        }
        public static SettingFragment newInstance(){
            SettingFragment fragement=new SettingFragment();
            return fragement;
        }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_setting, container, false);
    }

}

