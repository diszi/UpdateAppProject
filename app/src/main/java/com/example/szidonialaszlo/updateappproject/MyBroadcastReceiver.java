package com.example.szidonialaszlo.updateappproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by szidonia.laszlo on 2018. 01. 04..
 */

public class MyBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = "MyBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {


       StringBuilder sb = new StringBuilder();
        sb.append("Action: "+intent.getAction()+"\n");
        sb.append("URI: "+intent.toUri(Intent.URI_INTENT_SCHEME).toString()+"\n");
        String log = sb.toString();
       // Log.d(TAG,log);
        System.out.println(" ---------------------------------------------------\n "+log);
        System.out.println(" ---------------------------------------------------");
        Toast.makeText(context,log,Toast.LENGTH_LONG).show();




    }
}
