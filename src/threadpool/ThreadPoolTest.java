package threadpool;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Queue;
import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.DAYS, new ArrayBlockingQueue<Runnable>(1),new ThreadPoolExecutor.AbortPolicy());

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ConcurrentHashMap concurrentHashMap;
        HashMap hashMap;
        Hashtable hashtable;

    }
}
