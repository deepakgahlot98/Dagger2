package com.gahlot.dagger2.car;

import android.util.Log;

public class Tires {
    // this is a third party library we cannot modify it :(

    private static final String TAG = "Tires";

    public void inflate() {
        Log.d(TAG, "inflate: Tries are Inflated");
    }
}
