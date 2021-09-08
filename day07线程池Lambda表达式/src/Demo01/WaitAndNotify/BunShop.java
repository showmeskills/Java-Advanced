package Demo01.WaitAndNotify;

public class BunShop extends Thread {
    private Buns buns;
    int second = 5;
    boolean isFlag = true;
    boolean isTrue=true;
    public BunShop(){
        super();
    };
    public BunShop(String name,Buns buns){
        super(name);
        this.buns = buns;
    }
    @Override
    public void run(){
        int count = 0;
        while(this.isFlag){
            synchronized(this.buns){
                if(this.buns.flag == true){
                    try{
                        this.buns.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("开始做包子");
                if(count%2 == 0){
                    this.buns.skin ="ice";
                    this.buns.inner = "sweeter";
                }else{
                    this.buns.skin = "hot";
                    this.buns.inner = "beef";
                }
                count++;
                System.out.println("正在生产:"+this.buns.skin + this.buns.inner+"包子,5 秒后完成");
                this.isFlag=false;
                this.reset();
                while(isTrue){
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(second > 0){
                        System.out.println(second + "s");
                        second--;
                    }else{
                        //当包子做好了的时候 flag状态为true
                        this.buns.flag = true;
                        //唤醒customer 线程
                        this.buns.notify();
                        System.out.println("包子已经生产好了"+this.buns.skin+this.buns.inner+"包子");
                        System.out.println("customer 可以开始吃包子了");
                        this.isTrue = false;
                        this.isFlag = true;
                    }
                }
            }
        }
    }
    public void reset(){
        this.isTrue = true;
        this.second = 5;
    }
}
