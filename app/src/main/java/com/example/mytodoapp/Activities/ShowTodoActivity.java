package com.example.mytodoapp.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytodoapp.Adapter.ToDoAdapter;
import com.example.mytodoapp.Models.TaskModel;
import com.example.mytodoapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Date;

public class ShowTodoActivity extends AppCompatActivity {

    RecyclerView recyclerView_showTodo;
    FloatingActionButton add_item;
    ArrayList<TaskModel> taskModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_todo);

        getSupportActionBar().hide();
        add_item = findViewById(R.id.add_item);

/*
        String title, String description, Date startDate, Date endDate, String background,
                ArrayList<String> subtasks, int priority, boolean isCompleted, double timeLeft, String status, String listName
*/

        recyclerView_showTodo = findViewById(R.id.recyclerView_showTodo);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView_showTodo.setLayoutManager(linearLayoutManager);

        taskModels = new ArrayList<>();
        ToDoAdapter toDoAdapter = new ToDoAdapter(this, taskModels);
        recyclerView_showTodo.setAdapter(toDoAdapter);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("CP");
        arrayList.add("DSA");
        arrayList.add("Android");
        arrayList.add("Cloud");


        add_item.setOnClickListener(v -> {
            TaskModel taskModel = new TaskModel("Mahmood", "Ahmad", new Date("21/05/21"), new Date("23/05/21"), String.valueOf(R.drawable.rec),
                    arrayList, 7, true, 45, "inProgress", "default");
            int x;
            if(taskModels.isEmpty())
                x=0;
            else
                x = taskModels.size() ;
            taskModels.add(x, taskModel);
            toDoAdapter.notifyItemInserted(x);
            recyclerView_showTodo.smoothScrollToPosition(x);

        });
    }
}