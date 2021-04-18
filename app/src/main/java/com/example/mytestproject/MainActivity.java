package com.example.mytestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.liblibrary.LibTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LibTest.showToast(this, "哈哈");
    }
}