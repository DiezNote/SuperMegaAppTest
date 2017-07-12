package com.example.denfox.supermegaapp;

import android.content.Context;
import android.widget.Toast;

public class Sibichenko {
    private Context mContext;

    public Sibichenko(Context context){
        mContext = context;
        Toast.makeText(mContext, mContext.getResources().getString(R.string.hello), Toast.LENGTH_SHORT).show();
    }

}
