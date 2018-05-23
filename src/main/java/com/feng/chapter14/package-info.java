/**
 * @author jinx
 * @date 2018/5/22 16:52
 * Desc:运行时类型信息使得你可以在程序运行时发现和使用类型信息。
 *      1.如果程序中编写了大量的instance of表达式，就说明你的设计可能存在瑕疵。
 *      2.Integer.class/int.class List<T>/List<?>/List<? extends Number>/List<? super Cat>
 *      3.instance of/isInstance
 *      4.isAssignableFrom
 *      5.工厂方法设计模式
 *      6.所以RTTI和反射之间真正的区别只在于，对RTTI来说，编译器在编译时打开和编译.class文件，而对于反射来说。.class文件在编译时是不可获取的，
 *        所以实在运行时打开和检查.class文件。
 *      7.
 */
package com.feng.chapter14;