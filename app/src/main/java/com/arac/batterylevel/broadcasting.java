package com.arac.batterylevel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class broadcasting extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Battery low :))",Toast.LENGTH_LONG).show();

    }
}
