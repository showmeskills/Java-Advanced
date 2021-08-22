package Package;

public class DemoInteger {
    public static void main(String ...args){
        Integer in1 = new Integer(1);// 方法上有横线,说明方法过去了
        System.out.println(in1);

        Integer in2 = new Integer("222");
        System.out.println(in2);

        Integer in3 = Integer.valueOf(1111);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("11112222");
        System.out.println(in4);

        int i = in4.intValue();
        System.out.println(i);

        Double.toString(8.8);

        String s = "1110000";
        Double num = Double.parseDouble(s);
        System.out.println(num);
    }
}
