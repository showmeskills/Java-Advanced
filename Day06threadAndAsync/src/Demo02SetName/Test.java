package Demo02SetName;

import Demo01MultiThread.MyThread;

public class Test {
    public static void main(String[] args){
        SetThreadName mt = new SetThreadName();
        mt.setName("T1");
        mt.start();
        new SetThreadName("T2").start();
        new SetThreadName("T3").start();
    }
}
