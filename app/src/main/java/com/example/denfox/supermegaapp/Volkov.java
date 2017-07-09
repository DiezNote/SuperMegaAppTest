package com.example.denfox.supermegaapp;

import android.util.Log;

/**
 * Singleton because there is only one Sviat could be :)
 *
 * @author <a href="mailto:qbikkx@gmail.com">qbikkx</a>
 */

public class Volkov {
    private static final String TAG = "Volkov";

    private static Volkov instanse;

    private Volkov() {}

    public static Volkov getInstance(){
        if (instanse == null) {
            instanse = new Volkov();
            Log.d(TAG, "instance created");
        }
        return instanse;
    }
}
