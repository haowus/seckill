package org.seckill.exception;

/**
 * 秒杀相关异常
 * @author haowus919@gmail.com
 * @date 2020/5/29 16:39
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
