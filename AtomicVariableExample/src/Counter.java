/**
 *  This is a good single Thread environment and works just fine, but when more than one
 *  Thread is written there starts to be inconsistant results and this is due to the simple
 *  increment operation count plus plus
 *
 *  Below is a combination of three operations where we first read the value, then increment
 *  the value by one, and then return an updated value.
 ***/

public class Counter {

    /**
     * This is the class called Counter and it has only a single instance variable.
     * Here we read the value.
     * **/
     private int counter;

    /**
     *
     ***/
//    private volatile int counter;


    /** This is the getValue method that will return the final value of the Counter. **/
    public int getValue(){
        return counter;
    }

    /**
     * This is a single instance method called increment and it is going to increment
     * the variable of the Counter class we have on line 5.
     *
     * Here is where we increment the value by one from the Counter class.
     ***/
    public int increment(){
        return counter++;
    }

    /**
     *
     * **/
//    public synchronized int increment(){
//        return counter++;
//    }

}

// https://www.youtube.com/watch?v=edyK1OHLs6Y