package com.feng.chapter11.demo2;

import java.util.Arrays;
import java.util.List;

/**
 * @author jinx
 * @date 2019/03/26 22:19
 * Desc:Arrays.asList()方法不声明具体类型时(Arrays.<C></>asList())添加孙子类时编译不通过疑惑验证
 */
public class Test {

    public static void main(String[] args) {
        List<A> list = Arrays.asList(new B(), new C());
        System.out.println(list.size());
        // 编程思想11.3节p221页第一个例子显示此种方式编译不会通过，其实可以
        List<A> list2 = Arrays.asList(new D(), new E());
        System.out.println(list2.size());
    }
}
