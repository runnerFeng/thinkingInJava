package com.feng.chapter21.demo1;

/**
 * Desc:p655,多线程执行任务
 * Created by jinx on 2017/12/4.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
            System.out.println("Wait for LiftOff");
        }
    }
}
