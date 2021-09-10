package CaseStudy;


import java.io.File;

public class Demo01Filter {
    public static void main(String[] args) {
        FileFilterImpl fileFilterImpl = new FileFilterImpl();
        boolean result = fileFilterImpl.accept(new File(new File("").getAbsolutePath(),"src"));
        System.out.println(result);
    }

}
