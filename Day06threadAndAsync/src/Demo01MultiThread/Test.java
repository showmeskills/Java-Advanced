package Demo01MultiThread;

public class Test {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.start();

        new MyThread().start();
        new MyThread().start();

        System.out.println(Thread.currentThread().getName());
    }
}
