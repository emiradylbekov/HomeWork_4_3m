package com.example.homework_4_3m;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework_4_3m.continent.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container_fragment, new ContinentFragment()).commit();
    }
}