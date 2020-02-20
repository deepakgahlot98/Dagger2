package com.gahlot.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gahlot.dagger2.car.Car;
import com.gahlot.dagger2.car.DeselEngineModule;
import com.gahlot.dagger2.dagger.CarComponent;
import com.gahlot.dagger2.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder().deselEngineModule(
                new DeselEngineModule(100)
        ).build();

        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
