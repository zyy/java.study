package com.yycoder.rpc.core;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程工厂
 * Created by yangyang.zhao on 2017/7/31.
 */
public class NamedThreadFactory implements ThreadFactory {
    private static final AtomicInteger poolNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;
    private final boolean daemonThread;

    public NamedThreadFactory() {
        this("rpcserver-threadpool-" + poolNumber.getAndIncrement(), false);
    }

    public NamedThreadFactory(String prefix) {
        this(prefix, false);
    }

    public NamedThreadFactory(String prefix, boolean daemon) {
        this.namePrefix = prefix + "-thread-";
        daemonThread = daemon;
        SecurityManager s = System.getSecurityManager();
        group = (s == null) ? Thread.currentThread().getThreadGroup() : s.getThreadGroup();
    }

    public Thread newThread(Runnable runnable) {
        String name = namePrefix + threadNumber.getAndIncrement();
        Thread thread = new Thread(group, runnable, name, 0);
        thread.setDaemon(daemonThread);
        return thread;
    }

    public ThreadGroup getGroup() {
        return group;
    }
}
