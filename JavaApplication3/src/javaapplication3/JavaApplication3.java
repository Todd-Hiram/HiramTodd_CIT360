/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JavaApplication3 {

    public static void main(String[] args) {

        ExecutorService executorService = null;
        Counter counter = new Counter(); // Here is counter class.
        try {
            /** 
             * Here we are using the Executor Service to create a Thread pool
             * with 2 working Threads. 
             **/
            executorService = Executors.newFixedThreadPool(2);

            /** 
             * Here we have 2 Runnable tasks, task1 and task2, and both are 
             * calling increment method of the counter class above. The first task
             * increments 20000 time while the second task increments 80000 times.
             **/
            Runnable task1 = ()-> {
                for (int i = 1; i <= 20000; i++) {
                    counter.increment();
                }
            };

            Runnable task2 = ()-> {
                for (int i = 1; i <= 80000; i++) {
                    counter.increment();
                }
            };

            /** 
             * Here we are submitting both task1 and task2 methods above to the 
             * Executor Service by calling with the Submit method.
             **/
            executorService.submit(task1);
            executorService.submit(task2);
            
            // Here we are taking a pause of 1 second with the Sumbit method as well
            executorService.awaitTermination(1, TimeUnit.SECONDS);

            // Now here is where we are creating the the final value of the Counter
            System.out.println("Final counter Value: " + counter.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(executorService != null)
                executorService.shutdown();
        }
    }

}