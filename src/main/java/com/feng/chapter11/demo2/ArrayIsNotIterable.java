package com.feng.chapter11.demo2;

import java.util.Arrays;

/**
 * @author jinx
 * @date 2019/03/27 21:32
 * Desc:foreach()可以用于数组或者其他任何的Iterable,但并不意味着数组也是一个Iterable
 */
public class ArrayIsNotIterable {
    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] s = {"A", "B"};
        // 编译不通过
//        test(s);
        test(Arrays.asList(s));
    }

    static <T> void test(Iterable<T> iterable) {
        for (T t : iterable) {
            System.out.println(t);
        }
    }
}
