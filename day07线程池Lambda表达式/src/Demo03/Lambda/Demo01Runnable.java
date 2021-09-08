package Demo03.Lambda;

public class Demo01Runnable {
    public static void main(String[] args){
        Object obj = new Object();

        new Thread(()->{
            synchronized(obj){
                try{
                    obj.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                Thread.currentThread().setName("T1-");
                for (int i = 0; i < 5;i++){
                    System.out.println(Thread.currentThread().getName()+ i +"次线程");
                }
            }
        }).start();

        new Thread(()->{
            synchronized(obj){
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                Thread.currentThread().setName("T2-");
                for (int i = 0; i < 5;i++){
                    System.out.println(Thread.currentThread().getName()+ i +"次线程");
                }
                obj.notify();
            }
        }).start();
    }
}
