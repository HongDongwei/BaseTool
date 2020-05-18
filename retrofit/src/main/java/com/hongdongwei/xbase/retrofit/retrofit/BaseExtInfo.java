package com.hongdongwei.xbase.retrofit.retrofit;

import java.util.Map;

/**
 * Created by Android Studio.
 * User: Hongdongwei
 * Date: 2020/5/14
 * Time: 21:53
 */
public abstract class BaseExtInfo implements IExtInfo {
    /**
     * 数据键值对
     */
    protected Map<String, String> values;
    /**
     * 信息位置
     */
    protected ValuePos pos;

    public BaseExtInfo(Map<String, String> values) {
        this.values = values;
    }

    public BaseExtInfo(Map<String, String> values, ValuePos pos) {
        this.values = values;
        this.pos = pos;
    }

    @Override
    public Map<String, String> getValues() {
        return values;
    }

    @Override
    public ValuePos getPos() {
        return pos;
    }

    public enum ValuePos {
        /**
         * 请求头信息内
         */
        Headers,
        /**
         * 请求参数内
         */
        Query,
        /**
         * 请求体内
         */
        Body
    }
}

