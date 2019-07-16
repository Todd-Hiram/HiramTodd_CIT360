public class Main {

    public static void main(String[] args) {
        test(1000, 1);
    }

    private static void reportPerformance(int pass,
                                          long startTime, long endTime, int dimension)
    {
        System.out.format("Total execution time %d: %dms\n", pass, endTime - startTime);
        long n = dimension;
        long operations = (2 * n - 1) * n * n;
        System.out.format("Number of operations: %,d\n", operations);
        double performance = operations / (endTime - startTime) * 1000;
        System.out.format("Performance: %,.2f GFLOPS\n\n", performance / 1e9);

    }

    private static void test(int dimension, int threads)
    {
        System.out.format("Dimension: %d, Threads: %d\n\n", dimension, threads);
        float[][] matrixA = MatrixCalculator.generateRandom(dimension, dimension);
        float[][] matrixB = MatrixCalculator.generateRandom(dimension, dimension);

        long startTime = System.currentTimeMillis();
        float[][] matrixP = MatrixCalculator.multiply(matrixA, matrixB, threads);
        long endTime = System.currentTimeMillis();
        reportPerformance(1, startTime, endTime, dimension);

        startTime = System.currentTimeMillis();
        matrixP = MatrixCalculator.multiply(matrixA, matrixB, threads);
        endTime = System.currentTimeMillis();
        reportPerformance(2, startTime, endTime, dimension);
    }

}
