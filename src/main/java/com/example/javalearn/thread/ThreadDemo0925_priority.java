package com.example.javalearn.thread;

import java.util.stream.IntStream;

public class ThreadDemo0925_priority {
    public static class T1 extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println(String.format("当前执行的线程是：%s，线程组名称：%s",
                    Thread.currentThread().getName(),
                    Thread.currentThread().getThreadGroup().getName()));

            System.out.println(getThreadGroup());
        }
    }

    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(i -> {
            Thread thread = new Thread(new T1());
            thread.setPriority(i);
            thread.start();
        });
    }

    public void getThreandGroup(){
        ThreadGroup threadGroup = new ThreadGroup("my");
        System.out.println(threadGroup.getName());

    }
}
