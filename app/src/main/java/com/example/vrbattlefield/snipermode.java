package com.example.vrbattlefield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class snipermode extends AppCompatActivity {


    public void back(View view)
    {
        Intent intent = new Intent(getApplicationContext(), Modes.class);
        startActivity(intent);
    }

    public void okay(View view)
    {
        Intent intent = new Intent(getApplicationContext(), LobbyActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snipermode);
    }
}