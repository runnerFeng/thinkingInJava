package com.feng.chapter11.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * Created by jinx on 2017/10/23.
 */
public class Test {
    public static void main(String[] args) {
        //容器不能持有基本数据类型
//        List<int> a ;
        int s = 1;
        List<Integer> a = new ArrayList<>();
        //自动装箱机制把int转为Integer类型然后存入a中
        a.add(s);

    }
}
