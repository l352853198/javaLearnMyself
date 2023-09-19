package com.example.javalearn.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class FutureDemo0903_Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long timeMillis = System.currentTimeMillis();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3);
        FutureTask<String> stringFutureTask1 = new FutureTask<>(()->{
            System.out.println("1111");
            Thread.sleep(1000);
            return "1";
        });

        FutureTask<String> stringFutureTask2 = new FutureTask<>(()->{
            System.out.println("2222");
            Thread.sleep(2000);
            return "2";
        });

        FutureTask<String> stringFutureTask3 = new FutureTask<>(()->{
            System.out.println("3333");
            Thread.sleep(3000);
            return "a3";
        });
        scheduledThreadPoolExecutor.execute(stringFutureTask1);
        scheduledThreadPoolExecutor.execute(stringFutureTask2);
        scheduledThreadPoolExecutor.execute(stringFutureTask3);
        System.out.println(System.currentTimeMillis()-timeMillis+""+"============");
        String cc = stringFutureTask3.get();
        System.out.println(System.currentTimeMillis()-timeMillis+""+"============");
        String bb = stringFutureTask2.get();
        System.out.println(System.currentTimeMillis()-timeMillis+""+"============");
        String aa = stringFutureTask1.get();
        System.out.println(System.currentTimeMillis()-timeMillis+""+"============");
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

        CompletableFuture<Object> objectCompletableFuture = new CompletableFuture<>();
        objectCompletableFuture.get();

    }
}
