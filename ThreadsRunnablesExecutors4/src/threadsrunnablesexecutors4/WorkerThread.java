/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsrunnablesexecutors4;

/**
 * The Runnable interface are operated by any class whose instances are intended to be executed
 * by a thread. 
 * 
 * The Runnable interface defines a single method, run, that are meant to contain the
 * code executed in the thread. When an object employing the Runnable interface (void run()) 
 * is being used to create a thread, threads that begin causes the run method in objects to
 * be called in the seperately executed thread. In this example, threads are run without the
 * executorService() but started by implementing Runnable. You can also start threads by sub-classing
 * threads but a task can be done by overriding only run() method of Runnable.
 * 
 * @author hiramtodd
 */
public class WorkerThread implements Runnable {
    
    private String data;
    
    public WorkerThread(final String anyData) {
        this.data = anyData;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            
            System.out.println("[" + Thread.currentThread().getName() + "] [data =" + this.data + "] Message " + i);
            try {
                Thread.sleep(200);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
    
}
