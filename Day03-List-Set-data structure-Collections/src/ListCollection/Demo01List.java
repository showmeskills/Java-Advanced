package ListCollection;

import java.util.ArrayList;
import java.util.List;

public class Demo01List {
    public static void main(String ...args){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.set(3,"5");
        list.add(1,"9");
        System.out.println(list);
    }
}
