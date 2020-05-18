package com.hongdongwei.xbase.retrofit.retrofit;

import java.util.Map;

/**
 * Created by Android Studio.
 * User: Hongdongwei
 * Date: 2020/5/14
 * Time: 21:55
 */
public class QueryExtInfo extends BaseExtInfo {
    public QueryExtInfo(Map<String, String> values) {
        super(values, ValuePos.Query);
    }
}

