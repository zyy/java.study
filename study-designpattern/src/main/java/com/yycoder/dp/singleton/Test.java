package com.yycoder.dp.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 下午1:51
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        SingletonTest instance1 = SingletonTest.getInstance();
        SingletonTest instance2 = SingletonTest.getInstance();
        System.out.println(instance1 == instance2);
    }
}
