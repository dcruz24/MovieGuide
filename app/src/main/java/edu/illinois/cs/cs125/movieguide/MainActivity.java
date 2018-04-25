package edu.illinois.cs.cs125.movieguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id. MovieButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             openActivity2();
            }
        });
    button2 = findViewById(R.id.MovieButton2);
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openActivity2();
        }
    });
    button3 = findViewById(R.id.MovieButton3);
    button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openActivity2();
        }
    });
    button4 = findViewById(R.id.MovieButton4);
    button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openActivity2();
        }
    });
    button5 = findViewById(R.id.MovieButton5);
    button5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openActivity2();
        }
    });
    button6
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    }
