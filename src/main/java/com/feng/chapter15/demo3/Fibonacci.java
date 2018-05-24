package com.feng.chapter15.demo3;

import com.feng.chapter15.demo2.Generator;

/**
 * @author jinx
 * @date 2018/5/24 17:11
 * Desc:菲波那切数列
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 20; i++) {
            System.out.println(fibonacci.next());
        }
    }

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
