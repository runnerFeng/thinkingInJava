package com.feng.chapter11.demo1;

import java.util.*;

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

        Collection collection = new ArrayList();
        //只接受一个Collection，不灵活
//        collection.addAll(1);
        //该方法使用可变参数列表
        Collections.addAll(collection,1);

//        Set
//        Arrays
//        Collectors

        //throw UnsupportedOperationException,because the underlying array cannot be resized.
        List<Integer> list = Arrays.asList(11,12,13);
        list.add(14);
        System.out.println(list);

    }
}
