package com.gahlot.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {}

    private static final String TAG = "Car";
    @Override
    public void start() {
        Log.d(TAG, "start: Petrol Engine Started");
    }
}
