package Stringbuilder;

public class StringBuilderDemo {
    public static void main(String ...args){
        demo();
    }
    private static void demo(){
        StringBuilder sample = new StringBuilder("123");
        StringBuilder sample2 = sample.append("abcefg");
        System.out.println(sample);
        System.out.println(sample2);
        System.out.println(sample==sample2);//true
    }
    private static void demo02(){

    }
}
