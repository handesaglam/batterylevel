package com.arac.batterylevel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    broadcasting broadcastinclass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        broadcastinclass=new broadcasting();
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter ıntentfilter=new IntentFilter();
        ıntentfilter.addAction(Intent.ACTION_BATTERY_LOW);
        registerReceiver(broadcastinclass,ıntentfilter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(broadcastinclass);
    }
}