package com.hongdongwei.xbase.retrofit.retrofit;

import java.util.Map;

/**
 * Created by Android Studio.
 * User: Hongdongwei
 * Date: 2020/5/14
 * Time: 21:54
 */
public interface IExtInfo {
    /**
     * 获取扩展信息 的值
     *
     * @return
     */
    Map<String, String> getValues();

    /**
     * 获取扩展信息 位置
     *
     * @return
     */
    BaseExtInfo.ValuePos getPos();
}
