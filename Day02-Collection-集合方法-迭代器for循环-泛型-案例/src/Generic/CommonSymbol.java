package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class CommonSymbol {
    public static void main(String ...args){
        ArrayList<Integer> collList = new ArrayList<>();
        collList.add(1);
        collList.add(2);
        printArray(collList);
//        ArrayList<?> collList1 = new ArrayList<>();
//        collList1.add("Terry");
    }
    public static void printArray(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
    public static void method1(Collection<? extends Number> list){

    }
    public static void method2(Collection<? super Number> list){

    }
}
