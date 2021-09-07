package Demo03.sleep;

import java.util.Date;

public class DemoSleep {
    public static void main(String[] args){

        for(int i = 0; i <=60; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
