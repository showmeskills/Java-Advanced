package Demo07Lock;

public class Test {
    public static void main(String[] args){
        DemoLock demo = new DemoLock();
        new Thread(demo,"T1").start();
        new Thread(demo,"T2").start();
        new Thread(demo,"T3").start();
    }
}
