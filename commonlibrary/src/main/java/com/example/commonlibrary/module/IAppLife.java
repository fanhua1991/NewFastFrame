package com.example.commonlibrary.module;

import android.app.Application;
import android.content.Context;

/**
 * Created by jess on 18/07/2017 17:43
 * Contact with jess.yan.effort@gmail.com
 */

public interface IAppLife {
    void attachBaseContext(Context base);

    void onCreate(Application application);

    void onTerminate(Application application);
}
