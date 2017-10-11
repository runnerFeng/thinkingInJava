package com.feng.chapter8.demo2;

/**
 * Desc:探索-》多态
 * Created by jinx on 2017/9/29.
 */
public class Son extends Father {
    private Son() {
    }

    public static void main(String[] args) {
        // 如果要实例化一个抽象类必须重写其中的最少一个方法，如果该抽象类中没有定义方法，则要重写Object类的某个方法
        Father father = new Father() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}
