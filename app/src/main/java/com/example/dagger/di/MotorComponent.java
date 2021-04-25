package com.example.dagger.di;

import com.example.dagger.MainActivity;

import dagger.Component;

@Component(modules={MotorModule.class})
public interface MotorComponent {
    void inject(MainActivity mainActivity);
}
