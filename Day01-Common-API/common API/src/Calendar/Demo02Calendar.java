package Calendar;

import java.util.Calendar;

public class Demo02Calendar {
    public static void main(String ...args){
        demo01();
    }

    private static void demo01(){
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,2025);
        calendar.set(8888,8,9);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
    }
}
