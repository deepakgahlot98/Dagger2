package com.gahlot.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class DeselEngine implements Engine {
    private static final String TAG = "car";

    @Inject
    public DeselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Desil Engine Started");
    }
}
