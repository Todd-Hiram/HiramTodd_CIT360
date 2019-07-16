import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * MatrixCalculator class contains multiply method. This method creates an
 * ExecutorService object, which handles the pool of threads.
 * Furthermore, the method creates a worker, an instance of the CalcOneElement
 * class, for every element of the result matrix. The worker is then passed
 * to the executor. Finally, a while loop is waiting for all workers to
 * complete their job.
 * @author hiramtodd
 */

public class MatrixCalculator {

    public static float[][] multiply(float[][] matrixA, float[][] matrixB, int threads) {
        float[][] matrixP = new float[matrixA.length][matrixB[0].length];
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                Runnable worker = new CalcOneElement(matrixP, matrixA, matrixB, i, j);
                executor.execute(worker);
            }
        }
        /* *
         * The shutdown() method doesn’t cause an immediate destruction of the ExecutorService. It will make the
         * ExecutorService stop accepting new tasks and shut down after all running threads finish their current work.
         * * */
        executor.shutdown();

        // Waits for all taks to complete after shutdown
        while (!executor.isTerminated()) {
        }
        return matrixP;
    }

    public static void showMatrix(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static float[][] generateRandom(int rows, int columns) {
        float[][] matrix = new float[rows][columns];
        Random gen = new Random();
        for(int i = 0; i < rows; i++) {
            float[] matrixRow = matrix[i];
            Arrays.fill(matrixRow, gen.nextFloat() * 10);
        }
        return matrix;
    }

}