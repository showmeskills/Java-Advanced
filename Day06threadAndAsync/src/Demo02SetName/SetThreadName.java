package Demo02SetName;

public class SetThreadName extends Thread {
    public SetThreadName(){
        super();
    };
    public SetThreadName(String name){
        super(name);
    }
    @Override
    public void run(){
        String name = getName();
        System.out.println("name:"+name);
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}
