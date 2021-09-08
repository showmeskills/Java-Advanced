package Demo04.Cook;

public class Test {

    public static void main(String[] args){
        invokeCook(()->{
            System.out.println("吃饭了");
        });

    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
