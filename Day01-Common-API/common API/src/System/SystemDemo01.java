package System;

import java.util.Arrays;

public class SystemDemo01 {
    public static void main (String ...args){
        demo02();
    }
    private static void demo01(){
        long start = System.currentTimeMillis();
        for(int i=0; i < 9999; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        long result = end-start;
        System.out.println(result);
    }
    private  static void demo02(){
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,1,dest,1,3);
        System.out.println(Arrays.toString(dest));
    }
}
