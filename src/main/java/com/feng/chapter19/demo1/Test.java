package com.feng.chapter19.demo1;
/**
 * Desc:protected关键字探索
 * Created by jinx on 2017/2/19.
 */
public class Test extends User {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("protected");
        // protected同包下的其他类可以访问
        user.getUserName();

        // 同包下的子类可以访问
        Test test = new Test();
        test.getUserName();
    }
}
