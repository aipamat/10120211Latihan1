package com.example.a10120211latihan1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//  11 April 2023
//  10120211 - Arif Rachmat Darmawan - IF6
    private int CurrentProgress = 0;
    private ProgressBar progressBar;
    private CardView cardViewIzin, cardViewKehadiran, cardViewLaporan, cardViewAgenda, cardViewBooking, cardViewWiki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//ProgressBar
        progressBar = findViewById(R.id.progress_jam);
        Button btnCheckin = findViewById(R.id.btn_checkin);
        btnCheckin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CurrentProgress = CurrentProgress + 10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
                if (CurrentProgress >= 100) {
                    Toast.makeText(getApplicationContext(), "Jam Kerja Kamu Sudah Full!", Toast.LENGTH_SHORT).show();
                }
            }
        });

//        Button Laporan Kamu
        Button btnBuatLaporan = findViewById(R.id.btn_buat_laporan);
        btnBuatLaporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Laporan Clicked", Toast.LENGTH_SHORT).show();
            }
        });

//CardView
        cardViewIzin = findViewById(R.id.cv_izin);
        cardViewKehadiran = findViewById(R.id.cv_kehadiran);
        cardViewLaporan = findViewById(R.id.cv_laporan);
        cardViewAgenda = findViewById(R.id.cv_agenda);
        cardViewBooking = findViewById(R.id.cv_booking);
        cardViewWiki = findViewById(R.id.cv_wiki);

        cardViewIzin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Izin Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardViewKehadiran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Kehadiran Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardViewLaporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Laporan Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardViewAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Agenda Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardViewBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Booking Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardViewWiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wiki Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}