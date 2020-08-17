package org.seckill.exception;

/**
 * 秒杀关闭异常
 * @author haowus919@gmail.com
 * @date 2020/5/29 16:38
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
