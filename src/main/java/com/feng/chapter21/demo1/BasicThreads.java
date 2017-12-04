package com.feng.chapter21.demo1;

/**
 * Desc:p655，将Runnable对象转变为工作任务的传统方式是把它提交给一个Thread构造器。
 * Created by jinx on 2017/12/4.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for LiftOff!");
    }
}
