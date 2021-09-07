package InnerClassThread;

public class Demo01InnerClassThread {
    public static void main(String[] args){
//        new Thread(){
//            @Override
//            public void run(){
//                for(int i =0; i < 20;i++){
//                    System.out.println(Thread.currentThread().getName()+i);
//                }
//            }
//        }.start();
//        new Thread(()->{
//            for(int i =0; i < 20;i++){
//                Thread.currentThread().setName("Terry");
//                System.out.println(Thread.currentThread().getName()+i);
//            }
//        }).start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 20;i++){
                    Thread.currentThread().setName("Terry");
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        };
        new Thread(r).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 20;i++){
                    Thread.currentThread().setName("Terry1");
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }).start();

    }
}
