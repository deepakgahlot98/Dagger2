package com.gahlot.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gahlot.dagger2.car.Car;
import com.gahlot.dagger2.dagger.CarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
        car.drive();
    }
}
