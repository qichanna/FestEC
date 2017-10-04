package com.liqi.festec.example;

import android.app.Application;

import com.liqi.latte.app.Latte;

/**
 * Created by liqi on 2017/10/4.
 */

public class ExampleApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
