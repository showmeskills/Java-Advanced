package ListCollection;

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main (String ...args){
        LinkedList<String> lList = new LinkedList<>();
        boolean isEmpty = lList.isEmpty();
        System.out.println(isEmpty);
        lList.add("a");
        lList.add("b");
        lList.add("c");
        lList.add("d");
        lList.removeFirst();
        lList.removeLast();
        String element = lList.pop();
        System.out.println(element);
    }
}
