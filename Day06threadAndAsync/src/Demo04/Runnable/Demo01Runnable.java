package Demo04.Runnable;

public class Demo01Runnable {
    public static void main(String[] args){
        RunnableImpl runnableImpl = new RunnableImpl();
        RunnableImpl2 RunnableImpl2 = new RunnableImpl2();
        Thread t = new Thread(runnableImpl);
        Thread t2 = new Thread(RunnableImpl2);
        t.setName("runnable1");
        t2.setName("runnable2");
        t.start();
        t2.start();
        for(int i = 0; i < 20 ; i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
