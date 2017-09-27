package com.feng.chapter7.demo1;

/**
 * Desc:
 * Created by jinx on 2017/9/27.
 */
public class Son extends Father {
    public void print() {
        System.out.println("son print method");
        super.print();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.print();

    }
}
