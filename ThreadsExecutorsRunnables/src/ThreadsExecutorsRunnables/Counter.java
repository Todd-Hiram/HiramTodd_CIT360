/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecutorsRunnables;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This is a good single Thread environment and works just fine, but when more than one
 * Thread is written there starts to be inconsistent results and this is due to the simple
 * increment operation of the count plus plus. 
 *
 * Below is a combination of three operations where we first read the value, then increment
 * the value by one, and then return an updated value. All three also have Atomic methods,
 * also called locks. Without the locks the counter results will provide unexpected results
 * as for the Atomic methods, the results are what will be expected.
 ***/

public class Counter {

    /**
     * This is the class called Counter and it has only a single instance variable.
     * Here we read the value.
     * **/
     private AtomicInteger counter = new AtomicInteger(0); // Locks
     
//    private int counter;  // Lock-free

    /** This is the getValue method that will return the final value of the Counter. **/
    public int getValue(){
        return counter.get();
    }
    
//    public int getValue(){
//        return counter;  // Lock-free
//    }

    /**
     * This is a single instance method called increment and it is going to increment
     * the variable of the Counter class we have on line 5.
     *
     * Here is where we increment the value by one from the Counter class.
     ***/
    public int increment(){
        return counter.getAndIncrement();  // Locks
    }

//    public int increment() {
//        return counter++;       // Lock-free
//    }
    
}

// https://www.youtube.com/watch?v=edyK1OHLs6Y
// https://www.youtube.com/watch?v=JqZ3vAW_8ss