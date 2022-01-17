package com.layne.interview.model;


import lombok.Data;

/**
 * 异常
 *
 * @author layne
 * @version UrlManage.java, v 0.1 2022/1/17 23:21 下午
 */
@Data
public class ManageException extends RuntimeException {

    /**
     * 错误码
     */
    private ErrorCodeEnum errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;


    private ManageException() {
        // do nothing
    }

    /**
     * 异常构造函数
     *
     * @param errorCode 错误码
     * @param errorMsg 错误信息
     * @param throwable 原始异常
     */
    public ManageException(ErrorCodeEnum errorCode, String errorMsg, Throwable throwable) {
        super(errorMsg, throwable);
        this.errorCode = errorCode;
    }

    /**
     * 异常构造函数
     *
     * @param errorCode 错误码
     * @param errorMsg 错误信息
     */
    public ManageException(ErrorCodeEnum errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
    }
}
