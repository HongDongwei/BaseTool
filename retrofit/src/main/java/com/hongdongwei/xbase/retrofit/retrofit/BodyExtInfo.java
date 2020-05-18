package com.hongdongwei.xbase.retrofit.retrofit;

import java.util.Map;

/**
 * Created by Android Studio.
 * User: Hongdongwei
 * Date: 2020/5/14
 * Time: 21:54
 */
public class BodyExtInfo extends BaseExtInfo {

    public BodyExtInfo(Map<String, String> values) {
        super(values, ValuePos.Body);
    }
}