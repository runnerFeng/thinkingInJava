package com.feng.chapter7.demo2;

/**
 * Desc:final关键字修饰变量（对象引用）测试 p141
 * Created by jinx on 2017/9/28.
 */
public class FinalData {
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    public static void main(String[] args) {
        FinalData finalData = new FinalData();
        System.out.println(finalData.v1);
        System.out.println(finalData.v1.i);
        System.out.println("---------------");

        // v1没用final修饰，故可以改变该引用,而且此处还给v1重新赋值了
        finalData.v1 = new Value(9);
        System.out.println(finalData.v1);
        System.out.println(finalData.v1.i);
        System.out.println("----------------");

        // final修饰的v2(一个引用)不能再改变（但是可以改变v2指向的对象的属性i）
//        finalData.v2 = new Value(0);//Error:cat`t change value
        // 改变该引用指向的对象的属性值
        finalData.v2.i = 3;
        System.out.println(finalData.v2);
        System.out.println(finalData.v2.i);

        // final修饰的VALUE_3不能再改变
//        VAL_3=new Value(1);
    }
}
