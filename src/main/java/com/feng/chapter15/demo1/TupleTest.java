package com.feng.chapter15.demo1;

/**
 * @author jinx
 * @date 2018/5/24 14:23
 * Desc:
 */
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 5);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 5);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 5);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> i() {
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 5, 5.5);
    }

    public static void main(String[] args) {
        TwoTuple twoTuple = f();
        System.out.println(twoTuple);
        //cannot assign value to final variable "first"
        //twoTuple.first = "a";
        System.out.println(g());
        System.out.println(h());
        System.out.println(i());
    }
}
