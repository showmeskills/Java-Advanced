package CollectionsDemo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
public class Demo01Collection {
    public static void main(String ...args){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"aa","bb","cc","dd");
        System.out.println(list1);
    }
}
