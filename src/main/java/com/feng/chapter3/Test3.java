package com.feng.chapter3;

/**
 * @author jinx
 * @date 2018/5/2 17:38
 * Desc:自动递增或者递减
 */
public class Test3 {
    public static void main(String[] args) {
        //对于前置递增/递减会先运算再生成值，反之则先生成值在运算
        int i = 0;
        System.out.println(++i);
        System.out.println(i);
        int j = 0;
        System.out.println(j++);
        System.out.println(j);
    }
}
