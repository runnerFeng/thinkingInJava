package com.feng.chapter8.demo1;

/**
 * Desc:探索-》多态：父类的引用指向子类的对象 对后期绑定概念的思考 p152
 * Created by jinx on 2017/9/29.
 */
public class Son extends Father {

    public static void main(String[] args) {

        Father father = new Father() {
            @Override
            public void print() {
                System.out.println("重写了print方法");
            }
        };

        Father father1 = new Father() {
            @Override
            public void print1() {
                System.out.println("重写了print1方法");
            }
        };

        // 该引用指向了重写之后的方法
        father.print();
        System.out.println("-----------");

        // 该引用指向了重写之后的方法
        father1.print1();
        System.out.println("-----------");

        // 该引用指向了子类的方法（即：后期绑定确定了父类的引用指向具体子类复写过得方法，多态的本质体现在此）
        father = new Son();
        father.print();
        System.out.println("-----------");

        // 因为该引用并没有重写print1方法，多以还是调用了父类自己的方法（可以使用该引用的前提是实例化抽象类时必须重写一个方法）
        father.print1();
    }

    public void print() {
        System.out.println("son`s print method");
    }

    public void print1() {
        System.out.println("son`s print1 method");
    }

}
