/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsrunnablesexecutors4;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author hiramtodd
 */
public class ThreadsRunnablesExecutors4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        

           System.out.println("Thread main started");
  
        /**
        * Here we submitted 5 tasks using new 'newFixedThreadPool', which created 2 new 
        * Threads that will then execute 2 tasks. The other 3 tasks will be waiting in
        * the queue until a Thread completes one of the 2 tasks, then as soon as any of
        * the tasks is completed by a Thread, another task will be selected from the 
        * queue by this Thread and executed.
        **/
        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task());
        executorService.execute(new Task());
        executorService.execute(new Task());
        executorService.execute(new Task());
        executorService.execute(new Task());
  
        executorService.shutdown();
  
        System.out.println("Thread main finished");
          
          
          
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
       System.out.println("Submitting the tasks for execution...");
       executorService.submit(task1);
       executorService.submit(task2);
       executorService.submit(task3);

       executorService.shutdown();

       System.out.println("Thread main finished");
       
       
       
       /**
        * This method will create a Thread pool that creates new Threads as needed
        * and will also reuse the previously created Threads when available. These pools
        * are generally beneficial when it comes to improved performance in programs
        * that execute many brief asynchronous tasks. 
        * 
        * If a call comes to execute a Thread and there are no Threads available or
        * existing, then a new Thread will be constructed and added to the pool. If 
        * Threads have not been used for sixty seconds, they are terminated and removed
        * from the cache. Pools, if in idle for a long period of time, will not consume
        * any resources.
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
           
        final ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println("Submitting the tasks for execution...");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();

        System.out.println("Thread main finished
        

        /**
         * This block uses the scheduledExecutorService() function in order to take a 
         * Runnable, a delay value, and the unit of delay. This little application
         * executes the task after 5 seconds from the time of submission.
         **/
        // Create a task
        Runnable task1 = () -> {
            
            System.out.println("Executing the task1 at: " + new Date());
            
        };

         // Create a task
        Runnable task2 = () -> {
            
            System.out.println("Executing the task2 at: " + new Date());
            
        };
 
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        System.out.println("Scheduling task to run after 5 seconds... " + new Date());
        scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(task2, 5, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
        System.out.println("Thread main finished");
        
       }
}
    

