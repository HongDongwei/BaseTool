package com.example.tool;

import android.content.Context;

/**
 * Created by Android Studio.
 * User: hongdw
 * Date: 2020/2/11
 * Time: 16:46
 */
public class DpUtils {
    //将px转换成dp
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    // dp转换成px
    public static int dip2px(Context context, float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

}
