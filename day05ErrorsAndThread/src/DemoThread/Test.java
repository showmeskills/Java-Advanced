package DemoThread;

public class Test {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.start();
        for(int i = 0; i < 20;i++){
            System.out.println("name: Terrance"+" is running"+i);
        }
    }
}
