package com.feng.chapter7.demo3;

/**
 * Desc:探索-》：final关键字修饰参数 p142
 * Created by jinx on 2017/9/28.
 */
public class FinalArguments {
    void with(final Gizmo g) {
        // final修饰的参数不能再给其赋值，此处g指一个引用
//        g = new Gizmo();
        System.out.println(g);
    }

}
