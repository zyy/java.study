package com.yycoder.juc.lock;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * Created by yangyang.zhao on 2017/11/22.
 */
public class AtomicReferenceFieldUpdaterTest {
    private static final AtomicReferenceFieldUpdater updater = AtomicReferenceFieldUpdater.newUpdater(Dog.class, String.class, "name");
    public static void main(String[] args) {
        Dog dog = new Dog();
        updater.compareAndSet(dog, dog.name, "cat");
        System.out.println(dog.name);
    }
}

class Dog {
    volatile String name = "dog";
}
