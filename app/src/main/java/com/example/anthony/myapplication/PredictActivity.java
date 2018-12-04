package com.example.anthony.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class PredictActivity extends AppCompatActivity {
    private User user = new User();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predict);
        Intent intent = getIntent();
        user = (User)intent.getSerializableExtra("User");
        /**
         * TODO display selected weather data and sport data on same graph
         * TODO make some kind of correlation between the data
         * ex:
         * avgspeed vs windspeed & temp
         * duration vs windspeed & temp
         * distance vs windspeed & temp
         * **/






    }
}

