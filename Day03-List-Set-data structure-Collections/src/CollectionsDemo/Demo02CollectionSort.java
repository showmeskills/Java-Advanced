package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02CollectionSort {
    public static void main(String ...args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("E");
        list1.add("A");
        Collections.sort(list1);
        System.out.println(list1);
    }
}
