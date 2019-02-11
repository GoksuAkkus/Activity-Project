package com.example.student.myapplicationci;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private  static final String MyPreferences="MyMehmetPreferences";
    private  static final String Red="RedKey";
    private  static final String Green="GreenKey";
    private  static final String Blue="BlueKey";
    SeekBar seekBar1,seekBar2,seekBar3;
    LinearLayout linearLayout;
    SharedPreferences sharedPreferences;
    TextView textView,textView2,textView3;
    int red=0,green=0,blue=0;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        seekBar1=(SeekBar)findViewById(R.id.seekBar);
        seekBar2=(SeekBar)findViewById(R.id.seekBar2);
        seekBar3=(SeekBar)findViewById(R.id.seekBar3);
        textView=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        linearLayout=(LinearLayout)findViewById(R.id.linergor);
        sharedPreferences=getSharedPreferences(MyPreferences,MODE_PRIVATE);
      editor=sharedPreferences.edit();

        editor.putInt(Red,red);
        editor.putInt(Green,green);
        editor.putInt(Blue,green);

        editor.commit();
        linearLayout.setBackgroundColor(Color.argb(255,sharedPreferences.getInt(Red,0),sharedPreferences.getInt(Green,0),sharedPreferences.getInt(Blue,0)));
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("Red:"+seekBar1.getProgress());
                linearLayout.setBackgroundColor(Color.argb(255,seekBar1.getProgress(),seekBar2.getProgress(),seekBar3.getProgress()));
                red=seekBar.getProgress();
                green=seekBar.getProgress();
                blue=seekBar.getProgress();
                editor.putInt(Red,red);


                editor.commit();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView2.setText("Green:"+seekBar2.getProgress());
                linearLayout.setBackgroundColor(Color.argb(255,seekBar1.getProgress(),seekBar2.getProgress(),seekBar3.getProgress()));
                red=seekBar.getProgress();
                green=seekBar.getProgress();
                blue=seekBar.getProgress();

                editor.putInt(Green,green);


                editor.commit();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView3.setText("Blue:"+seekBar3.getProgress());
                linearLayout.setBackgroundColor(Color.argb(255,seekBar1.getProgress(),seekBar2.getProgress(),seekBar3.getProgress()));
                red=seekBar.getProgress();
                green=seekBar.getProgress();
                blue=seekBar.getProgress();

                editor.putInt(Blue,green);

                editor.commit();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void geritikla(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
