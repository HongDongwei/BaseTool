package com.hongdongwei.xbase.retrofit.wrapper;

/**
 * Created by Android Studio.
 * User: Hongdongwei
 * Date: 2020/5/14
 * Time: 21:56
 */
public interface IWrapper<T> {
    int get_Code();

    String get_Msg();

    T get_Data();
}
