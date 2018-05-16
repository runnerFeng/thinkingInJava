/**
 * @author jinx
 * @date 2018/5/9 11:14
 * Desc:可以将一个类的定义放在另一个类的定义内部，这就是内部类。
 *      1.可以再一个方法里面或者在任意的作用域内定义内部类，这么做有两个理由：
 *      1.1.你实现了某类型的接口，于是可以创建并返回对其的引用。
 *      1.2.你要解决一个复杂的问题，想创建一个类来辅助你的解决方案，但是又不希望这个类是公共可用的。
 *      2.对于匿名内部类而言实例初始化的实际效果就是构造器。当然他受到了限制-你不能重载实例初始化方法，所以你仅有一个这样的构造器。
 *      3.要想理解static应用于内部类是的含义，就必须记住，普通的内部类对象隐式的保存了一个引用，    指向创建他的外围类对象。然而，当内部类是static时，
 *        就不是这样了。嵌套意味着
 *      3.1.要创建嵌套类的对象，并不依赖其外围类的对象。
 *      3.2.不能存嵌套类的对象中访问非静态的外围类的对象。
 *      4.如果你要创建某些公共代码，是得他们可以被某个接口的所有实现类公用，那么使用接口内部的嵌套类会显得很方便。
 *      5.内部类允许继承多个非接口类型(类或抽象类)。
 *      6.模板方法
 *      7.命令设计模式
 */
package com.feng.chapter10;