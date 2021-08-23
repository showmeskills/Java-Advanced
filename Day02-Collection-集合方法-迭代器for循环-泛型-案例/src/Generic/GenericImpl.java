package Generic;

public class GenericImpl implements GenericI<String>{
    @Override
    public void method(String e){
        GenericImpl1<String> gImpl1 = new GenericImpl1<>();
        gImpl1.method("what the fuck in the java");
    }
}

class GenericImpl1<E> implements GenericI<E>{
    @Override
    public void method(E e){
        System.out.println(e);
    }
}