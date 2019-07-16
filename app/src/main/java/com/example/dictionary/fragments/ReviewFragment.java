package com.example.dictionary.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dictionary.R;

public class ReviewFragment extends Fragment {
    public ReviewFragment(){

    }
    public static ReviewFragment newInstance(){
        ReviewFragment fragement=new ReviewFragment();
        return fragement;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_review, container, false);
    }
}
