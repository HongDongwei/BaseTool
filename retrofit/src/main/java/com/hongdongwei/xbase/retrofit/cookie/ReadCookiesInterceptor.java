package com.hongdongwei.xbase.retrofit.cookie;

import android.util.Log;

import com.hongdongwei.xbase.retrofit.ext.NetPrefUtil;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Android Studio.
 * User: Hongdongwei
 * Date: 2020/5/14
 * Time: 21:52
 */
public class ReadCookiesInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        HashSet<String> preferences = (HashSet) NetPrefUtil.getDefault().getStringSet(NetPrefUtil.PREF_COOKIES, new HashSet<>());
        for (String cookie : preferences) {
            // This is done so I know which headers are being added; this interceptor is used after the normal logging of OkHttp
            builder.addHeader("Cookie", cookie);
            Log.v("OkHttp", "Adding Header: " + cookie);
        }

        return chain.proceed(builder.build());
    }
}