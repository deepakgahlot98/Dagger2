package com.gahlot.dagger2.dagger;

import com.gahlot.dagger2.MainActivity;
import com.gahlot.dagger2.car.Car;
import com.gahlot.dagger2.car.DeselEngineModule;

import dagger.Component;

@Component (modules = {WheelsModule.class, DeselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
