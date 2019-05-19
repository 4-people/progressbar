package com.example.programmingknowledge.progressbar_ver1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;

public class MainActivity extends AppCompatActivity {


    DatabaseHelper myDB;
   // myDB = new DatabaseHelper(this);
    //ProgressBar prg,prg2,prg3,prg4,prg5;
    Button bt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final RoundCornerProgressBar progress1 = (RoundCornerProgressBar) findViewById(R.id.progressBar1);
        progress1.setProgressColor(Color.parseColor("#ff363636"));
        progress1.setProgressBackgroundColor(Color.parseColor("#ff454344"));
        progress1.setMax(100);
        //progress1.setProgress(75);

        int progressColor1 = progress1.getProgressColor();
        int backgroundColor1 = progress1.getProgressBackgroundColor();
        //int max1 = progress1.getMax();
        //int progress1 = progress1.getProgress();

        final RoundCornerProgressBar progress2 = (RoundCornerProgressBar) findViewById(R.id.progressBar2);
        progress2.setProgressColor(Color.parseColor("#ffff8800"));
        progress2.setProgressBackgroundColor(Color.parseColor("#7fff8800"));
        progress2.setMax(100);


        int progressColor2 = progress2.getProgressColor();
        int backgroundColor2 = progress2.getProgressBackgroundColor();

        final RoundCornerProgressBar progress3 = (RoundCornerProgressBar) findViewById(R.id.progressBar3);
        progress3.setProgressColor(Color.parseColor("#ff0099cc"));
        progress3.setProgressBackgroundColor(Color.parseColor("#7f0099cc"));
        progress3.setMax(100);


        int progressColor3 = progress3.getProgressColor();
        int backgroundColor3 = progress3.getProgressBackgroundColor();


        final RoundCornerProgressBar progress4 = (RoundCornerProgressBar) findViewById(R.id.progressBar4);
        progress4.setProgressColor(Color.parseColor("#ff9933cc"));
        progress4.setProgressBackgroundColor(Color.parseColor("#7f9933cc"));
        progress4.setMax(100);


        int progressColor4 = progress4.getProgressColor();
        int backgroundColor4 = progress4.getProgressBackgroundColor();


        final RoundCornerProgressBar progress5 = (RoundCornerProgressBar) findViewById(R.id.progressBar5);
        progress5.setProgressColor(Color.parseColor("#ffff4444"));
        progress5.setProgressBackgroundColor(Color.parseColor("#7fff4444"));
        progress5.setMax(100);


        int progressColor5 = progress5.getProgressColor();
        int backgroundColor5 = progress5.getProgressBackgroundColor();


        //prg=(ProgressBar)findViewById(R.id.progress_1);
        //prg2=(ProgressBar)findViewById(R.id.progressBar2);
        //prg3=(ProgressBar)findViewById(R.id.progressBar3);
        //prg4=(ProgressBar)findViewById(R.id.progressBar4);
        //prg5=(ProgressBar)findViewById(R.id.progressBar5);
        bt1 = (Button)findViewById(R.id.button);






        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress1.setProgress(75);
                progress2.setProgress(40);
                progress3.setProgress(100);
                progress4.setProgress(120);
                progress5.setProgress(50);
               // progress1.setProgress(75);
                //prg2.setProgress(40);
                //prg3.setProgress(100);
                //prg4.setProgress(120);
                //prg5.setProgress(50);
            }
        });
    }
}
