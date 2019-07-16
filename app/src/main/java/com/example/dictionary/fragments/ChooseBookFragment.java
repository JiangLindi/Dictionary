package com.example.dictionary.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
//import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.dictionary.R;
import com.example.dictionary.adapter.RecyclerViewAdapter;
import com.example.dictionary.data.Word;
import com.example.dictionary.utils.DividerItemDecoration;
import com.example.dictionary.utils.Text;
//import com.example.dictionary.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static com.example.dictionary.utils.DividerItemDecoration.VERTICAL_LIST;

public class ChooseBookFragment extends Fragment {
    private List<Word> mList=new ArrayList<>();
    String url="https://github.com/007rf/dingfan/blob/master/%E9%AB%98%E8%80%83%E8%AF%8D%E6%B1%87%E2%80%94%E2%80%94%E5%8F%AA%E6%9C%89%E5%8D%95%E8%AF%8D.txt";

    public ChooseBookFragment() {
    }

    public static ChooseBookFragment newInstance() {
        return new ChooseBookFragment();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_choose_book, container, false);
       initRecyclerView(view);
       return view;
    }
    private void initRecyclerView(View view) {
        init();//初始化item数据
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(Objects.requireNonNull(getContext()),VERTICAL_LIST));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mList);
        recyclerView.setAdapter(adapter);
    }
    private void init() {
//        String []arr10={"be","mind","behalf","public","debug","copy","abstract","solve","build","help"};
//        for(int i=0;i<10;i++){
//            Word one= new Word(arr10[i]);
//            mList.add(one);
//        }
         Text text=new Text();
        // String word= text.getReturnData(url);
         String word="be mind behalf ublic debug copy abstract solve build help";
         String[] arr10000= string2Array(word);
          for (String s : arr10000) {
              Word one = new Word(s);
              mList.add(one);

          }
    }
    /**
     * 字符串转换为字符串数组
     *
     * @param content 字符串
     * @return 字符串数组
     */
    public static String[] string2Array(String content) {
        if (content == null || content.length() == 0) {
            return null;
        }
        return content.split(" ");
    }
}