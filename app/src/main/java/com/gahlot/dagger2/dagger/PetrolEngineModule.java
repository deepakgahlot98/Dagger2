package com.gahlot.dagger2.dagger;

import com.gahlot.dagger2.car.Engine;
import com.gahlot.dagger2.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }

}
