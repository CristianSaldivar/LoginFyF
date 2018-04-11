package com.login.feliz.loginfire;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by feliz on 10/04/2018.
 */

public class LoginFireApp extends Application{
    // método auxiliar de activación de la aplicación del SDK debe invocarse una vez cuando se crea la aplicación.
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }
}
