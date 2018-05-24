package com.feng.chapter15.demo1;

/**
 * @author jinx
 * @date 2018/5/24 14:11
 * Desc:使用继承实现三元组
 */
public class ThreeTuple<A,B,C> extends TwoTuple {
    public final C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
