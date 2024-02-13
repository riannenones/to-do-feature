package com.group5.to_do_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton newtask;
    private ImageButton backhome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        newtask = (ImageButton) findViewById(R.id.newtask);
        newtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddTaskActivity();
            }
        });

    }
    public void openAddTaskActivity(){
        Intent intent = new Intent(this,AddTaskActivity.class);
        startActivity(intent);
    }


}