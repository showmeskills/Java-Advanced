package Demo03Exception;

import com.sun.tools.javac.util.List;

public class Demo01Exception {
    public static void main(String[] args) {
        method2();
    }
    public static void method(){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        try{
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
    public static void method2(){
        try{
            int [] arr = {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
