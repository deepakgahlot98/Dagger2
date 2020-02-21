package com.gahlot.dagger2.car;

import android.util.Log;

public class DeselEngine implements Engine {
    private static final String TAG = "car";

    private int hoursePower;

    public DeselEngine(int hoursePower) {
        this.hoursePower = hoursePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Desil Engine Started"+" horse power: " + hoursePower);
    }
}
