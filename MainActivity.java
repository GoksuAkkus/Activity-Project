package com.example.student.myapplicationci;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private  static final String MyPreferences="MyMehmetPreferences";
    private  static final String Red="RedKey";
    private  static final String Green="GreenKey";
    private  static final String Blue="BlueKey";
    ConstraintLayout gor;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences=getSharedPreferences(MyPreferences,MODE_PRIVATE);
       gor=(ConstraintLayout)findViewById(R.id.gorunum);
     gor.setBackgroundColor(Color.argb(255,sharedPreferences.getInt(Red,0),sharedPreferences.getInt(Green,0),sharedPreferences.getInt(Blue,0)));

    }

    public void tikla(View view) {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);


    }
}
