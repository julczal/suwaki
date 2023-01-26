package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar, seekBar2;
    TextView textView, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);

        seekBar.setMax(50);
        seekBar.setProgress(25);
        seekBar2.setMax(50);
        seekBar2.setProgress(25);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                dzialaniaSeekBar(progress, seekBar2.getProgress());
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
                dzialaniaSeekBar2(progress, seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void dzialaniaSeekBar2(int progress, int sB) {
        int mnozenie = progress * seekBar.getProgress();
        float dzielenie = (seekBar.getProgress() / sB);
        int dodawanie = seekBar.getProgress() + progress;
        int odejmowanie = seekBar.getProgress() - progress;
        textView2.setText("Pierwsza liczba: " + seekBar.getProgress());
        textView3.setText("Druga liczba: " + progress);
        if (seekBar2.getProgress() == 0) {
            textView.setText("Wynik mnożenia: " + mnozenie + "\n" +
                    "Nie można wykonać dzielenia przez 0" + "\n" +
                    "Wynik dodawania: " + dodawanie + "\n" +
                    "Wynik odejmowania: " + odejmowanie);
        }
        else {
            textView.setText("Wynik mnożenia: " + mnozenie + "\n" +
                    "Wynik dzielenie: " + dzielenie + "\n" +
                    "Wynik dodawania: " + dodawanie + "\n" +
                    "Wynik odejmowania: " + odejmowanie);
        }
    }
    @SuppressLint("SetTextI18n")
    public void dzialaniaSeekBar(int progress, int sB) {
        int mnozenie = progress * seekBar2.getProgress();
        float dzielenie = (sB / seekBar2.getProgress());
        int dodawanie = progress + seekBar2.getProgress();
        int odejmowanie = progress - seekBar2.getProgress();
        textView2.setText("Pierwsza liczba: " + progress);
        textView3.setText("Druga liczba: " + seekBar2.getProgress());
        if (seekBar2.getProgress() == 0) {
            textView.setText("Wynik mnożenia: " + mnozenie + "\n" +
                    "Nie można wykonać dzielenia przez 0" + "\n" +
                    "Wynik dodawania: " + dodawanie + "\n" +
                    "Wynik odejmowania: " + odejmowanie);
        }
        else {
            textView.setText("Wynik mnożenia: " + mnozenie + "\n" +
                    "Wynik dzielenie: " + dzielenie + "\n" +
                    "Wynik dodawania: " + dodawanie + "\n" +
                    "Wynik odejmowania: " + odejmowanie);
        }
    }
}