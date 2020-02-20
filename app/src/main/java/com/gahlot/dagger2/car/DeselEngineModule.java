package com.gahlot.dagger2.car;

import dagger.Module;
import dagger.Provides;

@Module
public class DeselEngineModule {

    private int horsePower;

    public DeselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DeselEngine(horsePower);
    }
}
