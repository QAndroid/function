package com.qandroid.function;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qandroid.common.QBaseActivity;
import com.qandroid.function.bitmap.BitmapActivity;
import com.qandroid.function.cache.CacheActivity;
import com.qandroid.function.log.LogActivity;
import com.qandroid.function.login.view.LoginActivity;

public class FunctionActivity extends QBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);
    }

    public void toLogin(View view) {
        toActivityByClass(LoginActivity.class);
    }

    public void toCache(View view) {
        toActivityByClass(CacheActivity.class);
    }

    public void toBitmap(View view) {
        toActivityByClass(BitmapActivity.class);
    }

    public void toLog(View view) {
        toActivityByClass(LogActivity.class);
    }
}