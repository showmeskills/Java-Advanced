package Demo07Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoLock implements Runnable {
    private int ticket = 100;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        boolean isFlag = true;
        while (isFlag) {
            l.lock();
            try {
                if (this.ticket > 0) {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket);
                    ticket--;
                } else {
                    isFlag = false;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                l.unlock();
            }
        }
    }
}
