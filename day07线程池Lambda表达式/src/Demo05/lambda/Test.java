package Demo05.lambda;

public class Test {
    public static void main(String[] args){
        toCalc(2,2,(int a,int b)-> a + b);
    }
    public static void toCalc(int a, int b,Calculation calculation){
        int sum = calculation.calc(a,b);
        System.out.println(sum);
    }
}
