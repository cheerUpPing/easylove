package com.easylove.entity;

/**
 * 2017/2/7 16:21.
 * <p>
 * Email: cheerUpPing@163.com
 */
public class EasyLoveException extends RuntimeException {

    public EasyLoveException(String errCode, String errMsg) {
        super(errCode + "#" + errMsg);
    }

}
