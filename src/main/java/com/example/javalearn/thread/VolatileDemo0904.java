package com.example.javalearn.thread;

public class VolatileDemo0904 {
    private static boolean runFlag = false; // 此处没有加 volatile


    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println("线程一等待执行");
            while (!runFlag) {
            }
            System.out.println("线程一开始执行");
        }).start();
        Thread.sleep(1000);
        new Thread(() -> {
            System.out.println("线程二开始执行");
            runFlag = true;
            System.out.println("线程二执行完毕");
        }).start();
    }
}
