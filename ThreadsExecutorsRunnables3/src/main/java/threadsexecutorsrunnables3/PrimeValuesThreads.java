/*
@author Hiram Todd
 */

package ThreadsExecutorRunnables3;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
This application searches for prime number between 1 and 1000. This is a Runnable file is called the PrimeValuesThread.
Runnable is a task that is executed by Thread. When a Thread is called with the Thread.start() method it also calls the
run() method that is the Runnable task.
*/
public class PrimeValuesThreads implements Runnable {

    // Here we are declaring the attributes
    int start;
    int stop;
    String file;

    // This is the constructor method
    public PrimeValuesThreads(int startValue, int stopValue, String fileName) {
        start = startValue;
        stop = stopValue;
        file = fileName;
    }


    /*
    This is the override method for the Runnable file which has the Run method that is executed
    when sent to the thread.
    */
    @Override
    public void run() {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = start; i <= stop; i += 2) {
            if (isPrime(i)) {   // Here is where the method is checking for prime values
                primes.add(i);  // and then here is where those prime number are added to the ArrayList.
            }
        } /* Here is where the prime values are added to a file and then the Thread is closed.*/
        try (PrintWriter print = new PrintWriter(new File(file))) {
            for (Integer prime : primes) {
                print.println(prime);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* */

    // This method searches for the prime number
    public static boolean isPrime(int toTest) {
        if (toTest == 2) {
            return true;
        }
        for (int n = 3; n < toTest; n += 2) {
            if (toTest % n == 0) {
                return false;
            }
        }
        return true;
    }
}

