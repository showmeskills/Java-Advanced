package LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DemoLinkedHashMap {
    public static void main(String ... args){
        methodOne();

    }
    public static void methodOne(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("a","A");
        map.put("c","C");
        map.put("f","F");
        map.put("e","E");
        map.put("b","B");
        map.put("a","D");
        System.out.println(map);
        LinkedHashMap<String,String> linked = new LinkedHashMap<String,String>();
        linked.put("a","A");
        linked.put("c","C");
        linked.put("f","F");
        linked.put("e","E");
        linked.put("b","B");
        linked.put("a","D");
        System.out.println(linked);
    }
}
