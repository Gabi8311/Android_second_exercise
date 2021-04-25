package com.example.dagger.di;
import com.example.dagger.Motor;

import dagger.Module;
import dagger.Provides;
@Module
public class MotorModule {

    @Provides
    public Motor providesMotorDiesel() {
        return new Motor("Diesel");
    }
}
