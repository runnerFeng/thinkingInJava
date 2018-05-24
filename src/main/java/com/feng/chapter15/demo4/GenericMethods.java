package com.feng.chapter15.demo4;

/**
 * @author jinx
 * @date 2018/5/24 18:07
 * Desc:1.注意，当使用泛型类时，必须在创建对象的时候指定类型参数的值，而使用泛型方法时通常不必指明参数类型，因为编译器会为我们找出具体的类型。这称为类型
 *        参数推断。
 */
public class GenericMethods {
    public <T> void f(T t){
        System.out.println(t.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods methods = new GenericMethods();
        methods.f(1);
        methods.f(1.1);
        methods.f("1");
        methods.f(1F);
        methods.f(methods);
    }
}
