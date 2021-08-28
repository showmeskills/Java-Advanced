package LinkedHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String ...args){
        calc(new Scanner(System.in));
    }
    public static void calc(Scanner scanner){
        System.out.println("----------Please entry a string-----------");
        String input = scanner.next();
        Map<Character,Integer> map = new HashMap<>();
        for(char charEle : input.toCharArray()){
            if(map.containsKey(charEle)){
                Integer value = map.get(charEle);
                value++;
                map.put(charEle,value);
            }else{
                map.put(charEle,1);
            }

        }
        System.out.println(map);
    }
}
