package com.dossmann.broadcast02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class CountHeadSetChange extends BroadcastReceiver {

    private TextView tv;
    private int nbChange;

    public CountHeadSetChange(TextView tv){
        this.tv = tv;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.hasExtra("myCustomBroadcast")){
            nbChange ++;
            tv.setText("Changed " +nbChange + "Time");
        }
    }

}
