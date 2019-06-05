/*
@author Hiram Todd
 */

package ThreadsExecutorRunnables2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadsRunnablesExecutors {

    /* Here we are producing a count of 4 Threads in a process of a CPU. The tasks of the 4 Threads are split up and the
    * prime numbers will be shown that are between 1 and 3000. */
    public static final int threadCount = 4; // This line limits the amount of Threads to 4 Threads.

    // Min. limit of prime numbers.
    public static final int start = 1;

    // Max. limit of prime numbers.
    public static final int stop = 3000;

    /* This is the lifecycle of the task. This service creates and maintains a reusable pool of Threads for executing
    submitted tasks. This will create the 4 reusable Threads and include a queue in case there are more tasks than the
    number of Threads. */
    public static ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

    public static void main(String[] args) {

        /* Here is where the prime values are added to an ArrayList and then  */
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        int incrementAmount = stop / threadCount; // This is where the increment count is divided

        // Message output here
        System.out.println("Spawning threads... ");

        // Here is where the 4 Threads are produced.
        for (int i = 0; i < threadCount; i++) {
            executorService.submit(new PrimeValuesThread((start + (i * incrementAmount)), (start + (i * incrementAmount) + incrementAmount), i + ".txt"));
        }

        // Output thread spawn completion message here
        System.out.println("Threads spawned...");

        // Here we shutdown the Executor service so no more Runnables are sent.
        executorService.shutdown();

        // Here is where all of the Threads complete.
        while (!executorService.isTerminated()) { }

        /* This is the output of the ArrayList of prime numbers. The results are all combined here
        and added to the txt file */
        System.out.println("Combining all results...");
        for (int i = 0; i < threadCount; i++) {
            File f = new File(i + ".txt");
            try (Scanner scan = new Scanner(new File(i + ".txt"))) {
                while (scan.hasNextInt()) {
                    primeNumbers.add(scan.nextInt());
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ThreadsRunnablesExecutors.class.getName()).log(Level.SEVERE, null, ex);
            }
            f.delete();
        }

            // Here we are outputting the ArrayList results to the file that will be called primeNumbers.txt.
            try (PrintWriter print = new PrintWriter(new File("primeNumbers.txt"))) {
                for (Integer prime : primeNumbers) {
                    print.println(prime);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Completion point
            System.out.println("Task Completion!");
    }
}
