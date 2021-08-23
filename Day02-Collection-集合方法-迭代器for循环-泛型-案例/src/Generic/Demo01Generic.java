package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String ...args){
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add(1);
        coll.add(true);
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

        GenericClass<String> demo = new GenericClass<>();
        demo.setName("Terry");
        String name = demo.getName();
        System.out.println(name);
    }
}
class GenericClass<E>{
    private E name;
    public GenericClass(){}
    public GenericClass(E name){
        this.name = name;
    }
    public E getName(){
        return this.name;
    }
    public void setName(E name){
        this.name = name;
    }
    public <M> void method(M parameter){
        System.out.println(parameter);
    }
    public static <N> void method01(N parameter){
        System.out.println(parameter);
    }
}
