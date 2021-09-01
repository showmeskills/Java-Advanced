package DemoThread;

public class MyThread extends Thread {
    private String name;
    public MyThread(){
        this.name = "Terry";
    };
    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i = 0; i < 20;i++){
            System.out.println("name: "+this.name+" is running"+i);
        }
    }
}
