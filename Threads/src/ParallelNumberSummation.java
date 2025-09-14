import java.util.Random;

public class ParallelNumberSummation {
    static class Sum implements Runnable{
        private int[] arr;
        private int start, end;
        private int sum;

        public Sum(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        public int getSum() {
            return sum;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
        }
    }

    public static void main(String[] args){
        //random array
        int[] numbers = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        // cores cpu
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of threads: " + numThreads);
        // Divide arrays to calculate
        int chunkSize = (int) Math.ceil(numbers.length * 1.0 / numThreads);
        // create runnables
        Sum[] cal = new Sum[numThreads];
        // Create threads
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, numbers.length);
            // create runnable
            cal[i] = new Sum(numbers, start, end);
            // put into Thread
            threads[i] = new Thread(cal[i]);
            // Start thread
            threads[i].start();

        }
        int totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(" Sum of array " + (i+1) + ": " +cal[i].getSum());
            totalSum += cal[i].getSum();
        }
        System.out.println("Total sum: " + totalSum);
    }
}