package com.easylove.entity;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.PrintStream;
import java.io.Serializable;

/**
 * 2017/1/17 16:42.
 * <p>
 * Email: cheerUpPing@163.com
 * 消息包裹  手机端和页面统一使用
 */
public class MsgWapper implements Serializable {

    private String code = "0000";

    private String msg = "request success!";

    private Object data;

    public MsgWapper(){

    }

    public MsgWapper(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out){
            @Override
            public void println(String x) {
                super.print(x);
                super.print("0");
                super.println("\n");
            }
        });
        System.out.println("000");
    }
}
