package Demo02.Threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo01Threadpool {
    public static void main(String[] args){
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
    }
}
