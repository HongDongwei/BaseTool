package com.hongdongwei.xbase.retrofit.cookie;

import com.hongdongwei.xbase.retrofit.ext.NetPrefUtil;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by Android Studio.
 * User: Hongdongwei
 * Date: 2020/5/14
 * Time: 21:53
 */
public class SaveCookiesInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());

        if (!originalResponse.headers("Set-Cookie").isEmpty()) {
            HashSet<String> cookies = new HashSet<>();

            cookies.addAll(originalResponse.headers("Set-Cookie"));

            NetPrefUtil.getDefault().edit()
                    .putStringSet(NetPrefUtil.PREF_COOKIES, cookies)
                    .apply();
        }

        return originalResponse;
    }
}