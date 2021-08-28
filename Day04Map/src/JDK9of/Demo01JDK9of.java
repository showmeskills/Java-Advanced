package JDK9of;

import java.util.List;

public class Demo01JDK9of {
    public static void main(String ...args){
        String[] arr = new String[]{"a","b","c"};
        List<String> list =List.of(arr);
        String element = list.get(0);
        System.out.println(element);
    }
}
