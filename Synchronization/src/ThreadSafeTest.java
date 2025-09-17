import java.util.*;

class ThreadSafe {
    private final List<String> list = new ArrayList<>();

    public synchronized void add(String element) {
        list.add(element);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized void remove(String element) {
        if (list.contains(element)) {
            list.remove(element);
        }
    }
    public synchronized List<String> getList() {
        return new ArrayList<>(list);
    }

}
public class ThreadSafeTest {
    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();

        Runnable addTask = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    threadSafe.add("String " + i);
                }
            }
        };
        Runnable removeTask = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    threadSafe.remove("String " + i);
                }
            }
        };
        Runnable add = new Runnable() {
            public void run() {
                threadSafe.add("Something");
            }
        };

        Thread t1 = new Thread(addTask);
        Thread t3 = new Thread(add);
        Thread t2 = new Thread(removeTask);

        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadSafe.getList());
        System.out.println("Final size: " + threadSafe.size());

    }
}


