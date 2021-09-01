package Demo04CustomError;

import java.util.ArrayList;
import java.util.Scanner;

public class Case {
    public static void main(String[] args)throws CustomError {
        ArrayList<String> list = new ArrayList<>();
        list.add("Terry");
        list.add("Erik");
        list.add("Tony");
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------enter your name-------------");
        String name = sc.next();
        checkName(name,list);
        //checkName2(name,list);
    }
    public static void checkName(String name,ArrayList<String> list){
        try{
            for(String ele:list){
                if(name.equalsIgnoreCase(ele)){
                    throw new CustomError("name has existed");
                }
            }
            System.out.println("your "+ name +" is registered");
            list.add(name);
            System.out.println(list.toString());
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void checkName2(String username,ArrayList<String> list) throws CustomError {
        for (String ele : list) {
            if (username.equals(ele)) {
                throw new CustomError("亲，该用户名已经被注册");
            }else{
                System.out.println("注册成功");
            }
        }

    }
}
