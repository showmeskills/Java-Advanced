package Demo02.Threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadpoolDemo {
    public static void main(String[] args){
       ExecutorService es = Executors.newFixedThreadPool(2);
        //ExecutorService es = Executors.newSingleThreadExecutor();
        //ExecutorService es = Executors.newCachedThreadPool();
//        es.execute(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
        try{
            es.execute(()->{
                for(int i = 0; i < 500; i++){
                    System.out.println(Thread.currentThread().getName() + "线程");
                }
            });
            es.execute(()->{
                for(int i = 0; i < 500; i++){
                    System.out.println(Thread.currentThread().getName() + "线程");
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            es.shutdown();
        }
    }
}
