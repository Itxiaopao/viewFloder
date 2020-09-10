package CountdownLatchTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownLatchTestClass {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        final CountDownLatch latch = new CountDownLatch(3);
        for (int i = 0; i < 3; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("子线程" + Thread.currentThread().getName() + "开始执行");
                        Thread.sleep((long) (Math.random() * 100000));
                        System.out.println("子线程" + Thread.currentThread().getName() + "执行完成");
                        latch.countDown();//当前线程调用此方法，则计数减一
                        System.out.println(latch.getCount());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);
        }

        try {
            System.err.println("主线程" + Thread.currentThread().getName() + "等待子线程执行完成...");
            latch.await();//阻塞当前线程，直到计数器的值为0
            System.err.println("主线程" + Thread.currentThread().getName() + "开始执行...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
