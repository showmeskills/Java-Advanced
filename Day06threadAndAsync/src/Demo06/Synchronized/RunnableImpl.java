package Demo06.Synchronized;

public class RunnableImpl implements Runnable{
    private static int ticket = 100;
    @Override
    public void run() {
        this.payTicket();
    }
//    public synchronized void payTicket(){
//        boolean isFlag = true;
//            while(isFlag){
//                if(this.ticket > 0){
//                    try{
//                        Thread.sleep(1000);
//                    }catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"正在出售第" + this.ticket);
//                    this.ticket--;
//                }else{
//                    isFlag = false;
//                }
//            }
//    }
    public static synchronized void payTicket(){
            synchronized (RunnableImpl.class){
                boolean isFlag = true;
                while(isFlag){
                    if(ticket > 0){
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"正在出售第" + ticket);
                        ticket--;
                    }else{
                        isFlag = false;
                    }
                }
            }
    }
}
