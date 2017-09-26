package com.feng.chapter19.demo2;

import com.think.in.java.chapter19.demo1.User;

/**
 * Desc:
 * Created by jinx on 2017/2/19.
 */
public class Test extends User {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("protected");
        // protected是提供给继承用的，包访问权限+子类访问权限，不同包下的类不可以访问
        //default是限制包访问权限，只能同包下才可以访问
//        user.getUserName();
        // 不同包下的子类可以访问
        Test test = new Test();
        test.getUserName();
    }

}
