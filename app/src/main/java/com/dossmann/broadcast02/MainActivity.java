package com.dossmann.broadcast02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = findViewById(R.id.counterJack);

        registerReceiver(new CountHeadSetChange(myTextView), new IntentFilter("com.dossmann.broadcast01.MyBroadcast"));

    }

}
