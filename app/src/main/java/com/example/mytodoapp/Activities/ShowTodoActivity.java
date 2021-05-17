package com.example.mytodoapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.mytodoapp.Adapter.ToDoAdapter;
import com.example.mytodoapp.R;

public class ShowTodoActivity extends AppCompatActivity {

    RecyclerView recyclerView_showTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_todo);


        getSupportActionBar().hide();

        recyclerView_showTodo = findViewById(R.id.recyclerView_showTodo);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView_showTodo.setLayoutManager(linearLayoutManager);

        ToDoAdapter toDoAdapter = new ToDoAdapter(this);
        recyclerView_showTodo.setAdapter(toDoAdapter);

    }
}