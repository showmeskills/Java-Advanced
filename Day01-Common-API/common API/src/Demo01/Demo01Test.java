package Demo01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo01Test {
    public static void main(String ...args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出生日期");
        System.out.println("请输入年");
        String year = scanner.next();

        System.out.println("请输入月");
        String month = scanner.next();

        System.out.println("请输入日");
        String day = scanner.next();


        String dob = year+"/"+month+"/"+day;
        Date date = new Date();
        long currentMS = date.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date birthDate = sdf.parse(dob);

        long birthdayMs = birthDate.getTime();
        long gap = currentMS - birthdayMs;
        String totalDays = gap/1000/60/60/24+"  days";
        System.out.println("your total days are, "+totalDays);
    }
}
