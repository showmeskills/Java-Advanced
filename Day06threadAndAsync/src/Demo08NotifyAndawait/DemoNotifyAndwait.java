package Demo08NotifyAndawait;

public class DemoNotifyAndwait {
    public static void main(String[] args){
        Object obj = new Object();

        new Thread(()->{
            boolean isFlag = true;
            while(isFlag){
                synchronized (obj){
                    System.out.println("客户1来了");
                    System.out.println("告知老板要的包子的种类和数量");
                    System.out.println("老板5秒钟之后作保包子,告知顾客,可以吃包子了");
                    try{
                        obj.wait();// 进入等待后(会跳出当前方法，执行函数后面的代码)；
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    //当进入等待状态时;下面代码不会执行；直到被唤醒
                    System.out.println("包子已经做好了,客户2开吃!");
                    System.out.println("----------------------------");
                    isFlag= false;
                }
            }
        }).start();
        new Thread(()->{
            boolean isFlag = true;
            int seconds = 0;
            while(isFlag){
                try{
                    Thread.sleep(1000);
                    seconds++;
                    System.out.println(seconds +"s");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized(obj){
                    if(seconds >=5){
                        //唤醒await 的代码；多个线程 随意唤醒
                        obj.notify();
                        isFlag = false;
                    }
                }
            }
        }).start();
    }
}
