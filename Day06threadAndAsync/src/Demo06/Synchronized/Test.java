package Demo06.Synchronized;

public class Test {
    public static void main(String[] args){
        RunnableImpl run = new RunnableImpl();
        new Thread(run,"T1").start();
        new Thread(run,"T2").start();
        new Thread(run,"T3").start();
    }
}
