package Demo05.Synchronized;

public class DemoSynchronized implements Runnable{
    private int tickets = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        boolean isFlag = true;
        //synchronized code block
        synchronized (this){
            while(isFlag){
              if(this.tickets > 0){
                  try{
                      Thread.sleep(1000);
                  }catch(InterruptedException e){
                      e.printStackTrace();
                  }
                  System.out.println(Thread.currentThread().getName()+"正在出售第" + this.tickets);
                  this.tickets--;
              }else{
                  isFlag = false;
              }
            }
        }
    }
}
