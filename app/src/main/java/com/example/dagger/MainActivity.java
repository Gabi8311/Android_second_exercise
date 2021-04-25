package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.dagger.di.MotorAplication;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Motor motor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MotorAplication)getApplication()).getMotorComponent().inject(this);
        Toast.makeText(MainActivity.this, motor.getMotorType(), Toast.LENGTH_SHORT).show();
    }
}