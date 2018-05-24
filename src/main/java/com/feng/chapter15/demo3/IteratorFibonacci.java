package com.feng.chapter15.demo3;

import java.util.Iterator;

/**
 * @author jinx
 * @date 2018/5/24 17:35
 * Desc:带有迭代器的菲波那切数列，该类体现了适配器设计模式。
 *      todo:使用组合替代继承实现适配器例子。
 */
public class IteratorFibonacci extends Fibonacci implements Iterable<Integer> {
    private int size;

    public IteratorFibonacci(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        IteratorFibonacci integers = new IteratorFibonacci(10);
        for (Integer o : integers) {
            System.out.println(o);
        }

        System.out.println(integers);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public Integer next() {
                size--;
                return IteratorFibonacci.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
