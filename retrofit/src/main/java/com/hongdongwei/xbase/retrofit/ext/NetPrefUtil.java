package com.hongdongwei.xbase.retrofit.ext;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Android Studio.
 * User: Hongdongwei
 * Date: 2020/5/14
 * Time: 21:53
 */
public class NetPrefUtil {

    private static Application sApplication;

    public static void init(Application application) {
        sApplication = application;
    }

    public static NetPrefUtil getInstance() {
        return classHolder.sNetPrefUtil;
    }

    public static SharedPreferences getDefault() {
        return getInstance().getDefaultPreferences();
    }

    static class classHolder {
        public static NetPrefUtil sNetPrefUtil = new NetPrefUtil();
    }

    public static final String PREF_COOKIES = "cookies";

    public SharedPreferences getDefaultPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(sApplication);
    }
}

