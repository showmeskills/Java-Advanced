package Demo01Expection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoExpection01 {
    public static void main(String... args)throws ParseException {
        methodOne();
        methodTwo();
        methodThree();
    }
    public static void methodOne()throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1999-09-09");
        System.out.println(date);
    }
    public static void methodTwo(){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse("1999-09-09");
            System.out.println(date);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("All good");
        }
    }
    public static void methodThree(){
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[3]);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("running done");
        }
    }

}
