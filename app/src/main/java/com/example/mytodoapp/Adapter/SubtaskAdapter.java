package com.example.mytodoapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytodoapp.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class SubtaskAdapter extends RecyclerView.Adapter<SubtaskAdapter.ViewHolder> {

    Context context;
    ArrayList<String> subtasks;

    public SubtaskAdapter(Context context, ArrayList<String> subtasks) {
        this.context = context;
        this.subtasks = subtasks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_subtask_single_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.subtask_materialTextView.setText(subtasks.get(position));

    }

    @Override
    public int getItemCount() {
        return subtasks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CheckBox subtask_CheckBox;
        MaterialTextView subtask_materialTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            subtask_CheckBox = itemView.findViewById(R.id.subtask_CheckBox);
            subtask_materialTextView = itemView.findViewById(R.id.subtask_materialTextView);

        }
    }
}
