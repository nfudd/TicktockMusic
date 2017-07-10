package com.lauzy.freedom.data.exception;

/**
 * Desc : 错误信息
 * Author : Lauzy
 * Date : 2017/7/7
 * Blog : http://www.jianshu.com/u/e76853f863a9
 * Email : freedompaladin@gmail.com
 */
public class ErrorMsgException extends Exception {

    public ErrorMsgException() {
    }

    public ErrorMsgException(String message) {
        super(message);
    }

    public ErrorMsgException(String message, Throwable cause) {
        super(message, cause);
    }
}
