package com.oasis.studyup;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by Administrator on 2016/8/11.
 * Email:yaoxiaochang@gmail.com
 */
public class App extends Application{
    private RefWatcher refWatcher;
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        refWatcher = LeakCanary.install(this);
    }

    private static RefWatcher getRefWatcher(Context context){
        App app = (App) context.getApplicationContext();
        return app.refWatcher;
    };

    private static Context getContext(){
        return context;
    }
}
