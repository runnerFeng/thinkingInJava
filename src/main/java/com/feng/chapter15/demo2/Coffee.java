package com.feng.chapter15.demo2;

/**
 * @author jinx
 * @date 2018/5/24 15:29
 * Desc:
 */
public class Coffee {
    private static long counter =0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+" "+id;
    }
}
