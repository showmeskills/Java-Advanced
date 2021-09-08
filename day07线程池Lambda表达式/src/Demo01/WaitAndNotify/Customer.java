package Demo01.WaitAndNotify;

public class Customer extends Thread{
    private Buns buns;
    boolean isFlag = true;
    boolean isTrue = true;
    int second = 0;
    public Customer(){
        super();
    }
    public Customer(String name,Buns buns){
        super(name);
        this.buns = buns;
    }
    @Override
    public void run(){
        while(this.isFlag){
            synchronized(this.buns){
                if(this.buns.flag == false){
                    try{
                        this.buns.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                //Thread is waited and then to run below codes
                System.out.println("吃货正在吃"+this.buns.skin + this.buns.inner+"的包子");
                System.out.println("customer in three seconds to finish");
                this.isFlag = false;
                this.reset();
                while(isTrue){
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }

                    if(second < 4){
                        second++;
                        System.out.println(second + "s");
                    }else{
                        this.buns.flag = false;
                        this.buns.notify();
                        System.out.println("吃货把"+this.buns.skin + this.buns.inner +"的包子吃完");
                        System.out.println("通知包子铺继续做包子");
                        System.out.println("-----------------------");
                        this.isTrue = false;
                        this.isFlag = true;
                    }
                }
            }
        }
    }
    public void reset(){
        this.isTrue = true;
        this.second=0;
    }
}
