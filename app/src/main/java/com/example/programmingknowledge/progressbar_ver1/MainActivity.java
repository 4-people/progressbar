package com.example.programmingknowledge.progressbar_ver1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;
   // myDB = new DatabaseHelper(this);
    ProgressBar prg,prg2,prg3,prg4,prg5;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prg=(ProgressBar)findViewById(R.id.progressBar);
        prg2=(ProgressBar)findViewById(R.id.progressBar2);
        prg3=(ProgressBar)findViewById(R.id.progressBar3);
        prg4=(ProgressBar)findViewById(R.id.progressBar4);
        prg5=(ProgressBar)findViewById(R.id.progressBar5);
        bt1 = (Button)findViewById(R.id.button);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prg.setProgress(75);
                prg2.setProgress(40);
                prg3.setProgress(100);
                prg4.setProgress(120);
                prg5.setProgress(50);
            }
        });
    }
}
