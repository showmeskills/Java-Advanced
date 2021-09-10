package Demo02.Recursion;

public class Recursion {
    public static void main(String[] args){
        //recursion(0);
        demo(0);
    }
    public static void recursion(int a){
        try{
            Thread.sleep(1000);
            System.out.println("current a is :"+ a);
            if(a == 10){
                System.out.println("recursion is completed");
                return;
            }else{
                a++;
                recursion(a);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }


    }
    public static void demo(int a){
        if( a > 10){
            return;
        }else{
            System.out.println(a);
            a++;
            demo(a);
        }
    }
}
