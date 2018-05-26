package com.feng.chapter15.demo5;

import com.feng.chapter15.demo2.Generator;

/**
 * @author jinx
 * @date 2018/5/25 14:36
 * Desc:
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
