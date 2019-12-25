package com.feng.chapter19.demo3;

/**
 * @Author: jinx
 * @Date: 2019-05-30 18:21
 * @Desc:
 */
public enum LikeClasses {
    WINKEN() {
        @Override
        void behavior() {
            System.out.println("behavior1");
        }
    }, BLINKEN {
        @Override
        void behavior() {
            System.out.println("behavior2");
        }
    }, NOD {
        @Override
        void behavior() {
            System.out.println("behavior3");
        }
    };

    abstract void behavior();
}
