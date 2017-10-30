package com.example.shreyas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               Intent next=new Intent(Main2Activity.this,MainActivity.class);
                String dir="happy";
                next.putExtra("directory",dir);
                startActivity(next);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(Main2Activity.this,MainActivity.class);
                String dir="horror";
                next.putExtra("directory",dir);
                startActivity(next);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent next=new Intent(Main2Activity.this,Main3Activity.class);

                startActivity(next);
            }
        });

    }



}
