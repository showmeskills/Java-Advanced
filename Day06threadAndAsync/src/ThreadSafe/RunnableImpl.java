package ThreadSafe;

public class RunnableImpl implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        boolean isFlag = true;
        while(isFlag){
            if(this.ticket > 0){
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
//                Thread.currentThread().setName("正在出售第");
                System.out.println(Thread.currentThread().getName()+"正在出售第" + this.ticket);
                this.ticket--;
            }else{
                isFlag = false;
            }

        }
    }
}
