package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar, seekBar2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        textView = (TextView) findViewById(R.id.textView);

        seekBar.setMax(50);
        seekBar.setProgress(25);
        seekBar2.setMax(50);
        seekBar2.setProgress(25);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int mnozenie = progress * seekBar2.getProgress();
                textView.setText("Pierwsza liczba: " + progress + "\n" + "Druga liczba: " + seekBar2.getProgress() + "\n" + "Wynik mnożenia: " + mnozenie);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar2, int progress, boolean fromUser) {
                int mnozenie = progress * seekBar.getProgress();
                textView.setText("Pierwsza liczba: " + seekBar.getProgress() + "\n" + "Druga liczba: " + progress + "\n" + "Wynik mnożenia: " + mnozenie);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }}