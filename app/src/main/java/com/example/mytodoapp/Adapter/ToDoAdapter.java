package com.example.mytodoapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytodoapp.R;
import com.google.android.material.textview.MaterialTextView;

import net.cachapa.expandablelayout.ExpandableLayout;

import java.util.ArrayList;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {

    Context context;

    public ToDoAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_todo_single_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ArrayList<String> str = new ArrayList<>();
        str.add("Task 1");
        str.add("Task 2");
        str.add("Task 3");
        str.add("Task 4");
        str.add("Task 5");

        SubtaskAdapter subtaskAdapter = new SubtaskAdapter(context,str);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false);
        holder.task_subtask_recyclerView.setLayoutManager(layoutManager);
        holder.task_subtask_recyclerView.setAdapter(subtaskAdapter);

    }

    @Override
    public int getItemCount() {
        return 7;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        MaterialTextView task_Title,task_description,task_priority,task_startDate,task_endDate,task_subtaskCompleted;
        ImageButton task_edit,task_more_options,task_show_details;
        CheckBox task_completed_checkbox;
        SeekBar task_time_progress,task_subtask_completed_bar;
        RecyclerView task_subtask_recyclerView;
        CardView task_cardView;
        ExpandableLayout task_subtaskExpandableLayout;

        @SuppressLint("ClickableViewAccessibility")
        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            //Material TextViews
            task_Title = itemView.findViewById(R.id.task_Title);
            task_description = itemView.findViewById(R.id.task_description);
            task_priority = itemView.findViewById(R.id.task_priority);
            task_startDate = itemView.findViewById(R.id.task_startDate);
            task_endDate = itemView.findViewById(R.id.task_endDate);
            task_subtaskCompleted = itemView.findViewById(R.id.task_subtaskCompleted);


            //ImageButtons
            task_edit = itemView.findViewById(R.id.task_edit);
            task_more_options = itemView.findViewById(R.id.task_more_options);
            task_show_details = itemView.findViewById(R.id.task_show_details);




            //Expandable Layout
            task_subtaskExpandableLayout = itemView.findViewById(R.id.task_subtaskExpandableLayout);

            //CheckBox
            task_completed_checkbox = itemView.findViewById(R.id.task_completed_checkbox);

            //SeekBar
            task_time_progress = itemView.findViewById(R.id.task_time_progress);
            task_subtask_completed_bar = itemView.findViewById(R.id.task_subtask_completed_bar);
            task_time_progress.setOnTouchListener((v, event) -> true);
            task_subtask_completed_bar.setOnTouchListener((v, event) -> true);


            //RecyclerView
            task_subtask_recyclerView = itemView.findViewById(R.id.task_subtask_recyclerView);

            //CardView
            task_cardView = itemView.findViewById(R.id.task_cardView);


            task_show_details.setOnClickListener(v -> {
                if(task_subtaskExpandableLayout.isExpanded())
                {
                    task_show_details.setBackgroundResource(R.drawable.down);
                    task_subtaskExpandableLayout.collapse();
                }
                else
                {
                    task_show_details.setBackgroundResource(R.drawable.up);
                    task_subtaskExpandableLayout.expand();
                }
            });


            task_subtaskCompleted.setOnClickListener(v -> {
                if(task_subtaskExpandableLayout.isExpanded())
                {
                    task_show_details.setBackgroundResource(R.drawable.down);
                    task_subtaskExpandableLayout.collapse();
                }
                else
                {
                    task_show_details.setBackgroundResource(R.drawable.up);
                    task_subtaskExpandableLayout.expand();
                }
            });


            task_more_options.setOnClickListener(v -> {
                PopupMenu popup = new PopupMenu(context, task_more_options);
                //Inflating the Popup using xml file
                popup.getMenuInflater()
                        .inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(item -> {
                    Toast.makeText(context, "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                    return true;
                });

                popup.show();
            });


        }
    }
}
