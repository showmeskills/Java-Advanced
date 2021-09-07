package Demo05.Synchronized;

public class Test {
    public static void main(String[] args){
        DemoSynchronized demo = new DemoSynchronized();
        new Thread(demo,"T1").start();
        new Thread(demo,"T2").start();
        new Thread(demo,"T3").start();
        //new Thread(new DemoSynchronized(),"T1").start() 这样写的话 会导致锁对象不是一个
    }
}
