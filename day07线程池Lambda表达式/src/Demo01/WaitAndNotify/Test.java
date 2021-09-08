package Demo01.WaitAndNotify;

public class Test {
    public static void main(String[] args){
        Buns buns = new Buns();
        Customer customer = new Customer("Terry",buns);
        BunShop bunshop = new BunShop("Terry's bunshop",buns);

        customer.start();
        bunshop.start();
    }
}
