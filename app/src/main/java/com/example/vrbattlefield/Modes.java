package com.example.vrbattlefield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Modes extends AppCompatActivity {

    public void selectQuickMatch(View view)
    {
        Intent intent = new Intent(getApplicationContext(), quickmatch.class);
        startActivity(intent);
    }
    public void selectWarZone(View view)
    {
        Intent intent = new Intent(getApplicationContext(), warzone.class);
        startActivity(intent);
    }
    public void selectSniperMode(View view)
    {
        Intent intent = new Intent(getApplicationContext(), snipermode.class);
        startActivity(intent);
    }

    public void selectStoryMode(View view)
    {
        Intent intent = new Intent(getApplicationContext(), storymissions.class);
        startActivity(intent);
    }

    public void selectTraining(View view)
    {
        Intent intent = new Intent(getApplicationContext(), training.class);
        startActivity(intent);
    }

    public void back(View view)
    {
        Intent intent = new Intent(getApplicationContext(), LobbyActivity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);
    }
}