package com.example.javalearn.thread;

public class ThreadDemo0925_blocked {


    public static void main(String[] args) {
        Thread a = new Thread(() -> testMethod(), "a");


        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "b");

        a.start();
        b.start();
        System.out.println(a.getName() + ":" + a.getState()); // 输出？
        System.out.println(b.getName() + ":" + b.getState()); // 输出？
    }
    // 同步方法争夺锁
    private static synchronized void testMethod() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


