package com.codewithdinesh.mathsformula;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grade extends AppCompatActivity {
Button btn_grade9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        btn_grade9=(Button) findViewById(R.id.grade9);

        btn_grade9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grade.this,index.class);
                 startActivity(in);

            }
        });
    }
}
