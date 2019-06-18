/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsrunnablesexecutors4;

/**
 *
 * @author hiramtodd
 */

// This is a Runnable task
class Task implements Runnable {
    
@Override
    public void run() { 
         for (int i = 0; i < 5; i++) {
             
              System.out.println("[" + Thread.currentThread().getName() + "] " + "Message " + i);
              try {
                  
                   Thread.sleep(200);
                   
              } catch (final InterruptedException e) {
                  
                   e.printStackTrace();
                   
              }
         }
    }
}
