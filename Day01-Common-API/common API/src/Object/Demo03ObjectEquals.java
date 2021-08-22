package Object;

import java.util.Objects;

public class Demo03ObjectEquals {
    public static void main(String ...args){
        String str1 = "abc";
        String str2 = "abc";
        boolean result = Objects.equals(str1,str2);
        System.out.println(result);
        int a = 123;
        int b = 123;
        boolean r1 = a==b;
        boolean r2 = Objects.equals(a,b);
        long c = 1234234;
        long d = 1234234;
        boolean r3 = Objects.equals(c,d);
    }
}
