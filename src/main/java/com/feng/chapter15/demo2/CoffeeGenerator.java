package com.feng.chapter15.demo2;

import java.util.Iterator;
import java.util.Random;

/**
 * @author jinx
 * @date 2018/5/24 16:08
 * Desc:泛型接口
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable {
    private static Random random = new Random(47);
    private Class[] types = {Latte.class, Macha.class, Americano.class, Breve.class, Cappuccina.class};
    private int size;

    public CoffeeGenerator() {
    }

    /**
     * 此处size是末尾哨兵的作用，判读什么时候停止
     */
    public CoffeeGenerator(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        CoffeeGenerator generator = new CoffeeGenerator();
        //生成Coffee
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }

        for (Object coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Iterator iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {
        private int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

}
