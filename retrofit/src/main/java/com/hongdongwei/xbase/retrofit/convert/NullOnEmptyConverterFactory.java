package com.hongdongwei.xbase.retrofit.convert;

/**
 * Created by Android Studio.
 * User: Hongdongwei
 * Date: 2020/5/14
 * Time: 21:51
 */
public class NullOnEmptyConverterFactory extends NullResponseConverterFactory<String> {

    @Override
    protected String convertNull() {
        return "";
    }
}
