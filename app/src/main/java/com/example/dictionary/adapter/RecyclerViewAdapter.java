package com.example.dictionary.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dictionary.R;
import com.example.dictionary.data.Word;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<Word> mList;

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView titleTextView;
        LinearLayout linearLayout;

        public ViewHolder(View view){
            super(view);
            //imageView=view.findViewById(R.id.image);
            titleTextView=view.findViewById(R.id.title);
            linearLayout=view.findViewById(R.id.layout);

        }
    }

    //传入展示数据,并且赋值给全局变量
    public RecyclerViewAdapter(List<Word> List){
        mList=List;
    }

    //创建ViewHolder实例,将item布局加载出来
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    //对RecyclerView的子项数据进行赋值
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Word mWord = mList.get(position);
       // holder.imageView.setImageResource(mWord.getIamgeId());
       // holder.imageView.setImageResource(mWord.getIamgeId());
        holder.titleTextView.setText(mWord.getTitle());



    }
    //获取RecyclerView有多少子项
    @Override
    public int getItemCount() {
        return mList.size();
    }
}
