class odd implements Runnable {
    private int len;
    public odd(int len) {
        this.len = len;
    }
    @Override
    public void run() {
        for (int i = 0; i <= len; i++) {
            if(i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }

    }
}
class even implements Runnable {
    private int len;
    public even(int len) {
        this.len = len;
    }
    @Override
    public void run() {
        for (int i = 0; i <= len; i++) {
            if(i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}
public class MultiThreadedNumberPrinting{
    public static void main(String[] args) {
        int len = 20;
        Runnable odd = new odd(len);
        Runnable even = new even(len);
        Thread oddThread = new Thread(odd);
        Thread evenThread = new Thread(even);
        oddThread.start();
        try{
            oddThread.join();
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
        evenThread.start();
    }
}