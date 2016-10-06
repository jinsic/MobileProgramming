package com.example.dlwls.quickcoding2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView_01;

    int iter = 0;
    int Max = 500;
    int min = 0;
    int mid = 250;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_01 = (TextView) findViewById(R.id.YNI);

    }


    public void onClick(View v) {//bigger
        min = mid + 1;
        mid = (Max + min) /2;
        iter++;
        textView_01.setText("Your Number is" + mid);
    }
    public void onClick1(View v) {//smaller
        Max = mid - 1;
        mid = (Max + min) /2;
        iter++;
        textView_01.setText("Your Number is" + mid);
    }

    public void onClick2(View v) {//bingo
        textView_01.setText("iter is " + iter);
    }


}
