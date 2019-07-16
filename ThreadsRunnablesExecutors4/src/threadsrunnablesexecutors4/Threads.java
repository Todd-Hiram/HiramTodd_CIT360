/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsrunnablesexecutors4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author hiramtodd
 */
public class Threads {
    
     /**
        * Instantiates a thread pool with a single thread
        * All tasks are executed sequentially by the same thread.
        * 
        * In this example we submitted 3 tasks used newSingleThreadExecutor and 
        * one Thread was created and executed one task at a time. There will be two
        * tasks out of the three waiting in the queue to be executed. As soon as a 
        * Thread finishes the one task, another task will be picked out of the queue
        * and the Thread will execute it.
        **/

        Runnable task1 = () -> {
            
             System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
             try {
                 TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                 throw new IllegalStateException(ex);
            }
        };

        Runnable task2 = () -> {
             System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
             try {
                  TimeUnit.SECONDS.sleep(4);
             } catch (InterruptedException ex) {
                  throw new IllegalStateException(ex);
             }
        };

        Runnable task3 = () -> {
             System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
            try {
                 TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                 throw new IllegalStateException(ex);
            }
       };

       final ExecutorService executorService = Executors.newSingleThreadExecutor();
//       System.out.println("Submitting the tasks for execution...");
//       executorService.submit(task1);
//       executorService.submit(task2);
//       executorService.submit(task3);
//
//       executorService.shutdown();

       // System.out.println("Thread main finished");
    
}
