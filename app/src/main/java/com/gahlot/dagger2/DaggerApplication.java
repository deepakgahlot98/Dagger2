package com.gahlot.dagger2;

import android.app.Application;

import com.gahlot.dagger2.car.DeselEngineModule;
import com.gahlot.dagger2.dagger.CarComponent;
import com.gahlot.dagger2.dagger.DaggerCarComponent;

public class DaggerApplication extends Application {

    private CarComponent carComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        carComponent = DaggerCarComponent.builder().deselEngineModule(new DeselEngineModule(100)).build();
    }

    public CarComponent getCarComponent() {
        return carComponent;
    }

}
