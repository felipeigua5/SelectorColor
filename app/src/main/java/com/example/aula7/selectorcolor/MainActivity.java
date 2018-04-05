package com.example.aula7.selectorcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    int seekR, seekG, seekB, seekA;
    SeekBar seekBarRed, seekBarGreen, seekBarBlue, seekBarAlpha;
    View viewBackgraound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarRed = (SeekBar)  findViewById(R.id.id_sb_red);
        seekBarGreen = (SeekBar) findViewById(R.id.id_sb_verde);
        seekBarBlue = (SeekBar) findViewById(R.id.id_sb_azul);
        seekBarAlpha = (SeekBar) findViewById(R.id.id_sb_alpha);
        viewBackgraound = (View) findViewById(R.id.id_v_background);

        seekBarAlpha.setOnSeekBarChangeListener(this);
        seekBarBlue.setOnSeekBarChangeListener(this);
        seekBarRed.setOnSeekBarChangeListener(this);
        seekBarGreen.setOnSeekBarChangeListener(this);
    }
    public void updateBackground(){
        seekR = seekBarRed.getProgress();
        seekG = seekBarGreen.getProgress();
        seekB = seekBarBlue.getProgress();
        seekA = seekBarAlpha.getProgress();

        int color = Color.argb(seekA, seekB, seekG, seekR);
        viewBackgraound.setBackgroundColor(color);
        
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        updateBackground();



    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
