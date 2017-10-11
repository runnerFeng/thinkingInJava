package com.feng.chapter8.demo3;

/**
 * Desc:子类可以重写父类的私有方法吗？不能，私有方法默认是final的。
 * Created by jinx on 2017/10/11.
 */
public class Son extends Father {
    public void test() {
        System.out.println("son`s public method ");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.test();
    }
}
