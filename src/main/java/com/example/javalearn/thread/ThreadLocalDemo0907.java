package com.example.javalearn.thread;

import org.openjdk.jol.info.ClassLayout;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.locks.ReentrantLock;
@Component
public class ThreadLocalDemo0907 {
    @Resource
    Redisson redisson;
    public synchronized void main1()    {
    RLock lock = redisson.getLock("");
        lock.lock();
}


    public static void main(String[] args) {
        RLock lock = redisson.getLock("");

        ReentrantLock reentrantLock = new ReentrantLock(true);

        new Thread(()->{
            reentrantLock.lock();
            System.out.println("==");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            reentrantLock.unlock();
        }).start();

        new Thread(()->{
            reentrantLock.lock();
            System.out.println("===");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            reentrantLock.lock();
        }).start();
    }
}
