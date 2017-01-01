package com.qandroid.function;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qandroid.function.bitmap.BitmapActivity;
import com.qandroid.function.cache.CacheActivity;
import com.qandroid.function.login.view.LoginActivity;

public class FunctionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);
    }

    public void toLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void toCache(View view) {
        Intent intent = new Intent(this, CacheActivity.class);
        startActivity(intent);
    }

    public void toBitmap(View view) {
        Intent intent = new Intent(this, BitmapActivity.class);
        startActivity(intent);
    }
}