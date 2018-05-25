package com.feng.chapter15.demo5;

/**
 * @author jinx
 * @date 2018/5/25 14:41
 * Desc:
 */
public class CountedObject {
    private static long count;
    private final long id = count++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject{" +
                "id=" + id +
                '}';
    }
}
