package com.leado.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leado.R;

public class CourseItemsAdapter extends RecyclerView.Adapter<CourseItemsAdapter.MyViewHolder>{

    Context context;

    public CourseItemsAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CourseItemsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.course_items , parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseItemsAdapter.MyViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
