package Demo01Expection;

import java.util.Objects;

public class Demo04Object {
    public static void main(String[] args){
        String str = null;
        method(str);
    }
    public static void method(Object obj){
        //if obj is null, and then it will throw a null pointer
        Objects.requireNonNull(obj,"object is null");
    }
}
