package com.feng.chapter15.demo5;

import com.feng.chapter15.demo2.Generator;

/**
 * @author jinx
 * @date 2018/5/25 14:43
 * Desc:通用的generator生成器
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> generator = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
    }
}
