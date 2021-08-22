package DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String ...args)throws Exception{
        demo01();
        demo02();
    }
    private static void demo01(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date =new Date();//本地时间
        String format = sdf.format(date);
        System.out.println(format);
    }
    private static void demo02() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date =sdf.parse("2021/08/22 15:45:23");//本地时间
        System.out.println(date);//Sun Aug 22 15:45:23 AEST 2021
    }
}
