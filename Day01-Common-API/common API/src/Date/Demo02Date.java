package Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String ...args){
        demo01();
    }
    public static void demo01(){
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(1621775654952L);
        System.out.println(date1);

        long msTime = date.getTime();
        System.out.println(msTime);
    }
}
