package ThreadSafe;

public class Demo01Ticket {
    public static void main(String[] args){
        RunnableImpl run = new RunnableImpl();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
    }
}
