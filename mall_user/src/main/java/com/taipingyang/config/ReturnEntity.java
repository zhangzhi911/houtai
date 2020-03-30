package com.taipingyang.config;

import lombok.Data;

@Data
public class ReturnEntity {

    private String code;

    private String msg;

    private Object o;

    public ReturnEntity(String code, String msg, Object o) {
        this.code = code;
        this.msg = msg;
        this.o = o;
    }

    public static ReturnEntity ok(String code, String msg, Object o) {
        return new ReturnEntity(code, msg, o);
    }

    public static ReturnEntity ok() {
        return new ReturnEntity("200", "操作成功", null);

    }

    public static ReturnEntity ok(String msg, Object o) {
        return new ReturnEntity("200", msg, o);

    }

    public static ReturnEntity ok(Object o) {
        return new ReturnEntity("200", "操作成功", o);
    }

    public static ReturnEntity ok(String msg) {
        return new ReturnEntity("200", msg, null);
    }


    public static ReturnEntity error(String code, String msg, Object o) {
        return new ReturnEntity(code, msg, o);
    }

    public static ReturnEntity error() {
        return new ReturnEntity("500", "操作失败", null);

    }

    public static ReturnEntity error(String msg, Object o) {
        return new ReturnEntity("500", msg, o);

    }

    public static ReturnEntity error(Object o) {
        return new ReturnEntity("500", "操作失败", o);
    }

    public static ReturnEntity error(String msg) {
        return new ReturnEntity("500", msg, null);
    }
}