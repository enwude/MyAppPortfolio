package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchPopularMovies(View view) {

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Popular Movies App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void launchStockHawk(View view) {

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Stock Hawk App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void launchBuildItBigger(View view) {

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void launchMakeYourAppMaterial(View view) {

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Make Your App Material App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void launchGoUbiquitous(View view) {

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Go Ubiquitous App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void launchCapstone(View view) {

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
