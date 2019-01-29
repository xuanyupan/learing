package SYNC;

/**
 * @Date: 2019/1/28 16:21
 * @Author: xuanyupan
 * @Desc: synchronized 修饰同步代码块
 */
public class SyncTest1 implements Runnable {
    private static int count;

    public SyncTest1() {
        count = 0;
    }

    public void run() {
        //  修饰代码块，作用于调用的对象
        //  同一时刻 只有一个对象可以获得这一块代码的执行，其他都被阻塞
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }  //  这个花括号｛｝中间的 都是“同步代码块”
    }

    public int getCount() {
        return count;
    }

    public static void test_1() {

        SyncTest1 SyncTest1 = new SyncTest1();
        Thread thread1 = new Thread(SyncTest1, "SyncTest11");
        Thread thread2 = new Thread(SyncTest1, "SyncTest12");
        thread1.start();
        thread2.start();
        // 这里创建了一个 SyncTest1 对象，开启了两个线程访问，由于同步代码块只能由一个对象访问，所以出现了以下的情况
        // 一个线程先访问完，才轮到另一个线程执行
       /* 结果如下
        SyncTest12:0
        SyncTest12:1
        SyncTest12:2
        SyncTest12:3
        SyncTest12:4
        SyncTest11:5
        SyncTest11:6
        SyncTest11:7
        SyncTest11:8
        SyncTest11:9*/
    }


    public static void test_2() {
        Thread thread1 = new Thread(new SyncTest1(), "SyncTest11");
        Thread thread2 = new Thread(new SyncTest1(), "SyncTest12");
        thread1.start();
        thread2.start();

      /* result。  结果如下，发现1,2随机出 原因是上面声明了 SyncTest1 两个对象，所以锁的是各自的对象，两个对象互不影响
        SyncTest11:0
        SyncTest12:1
        SyncTest11:2
        SyncTest12:3
        SyncTest12:4
        SyncTest11:5
        SyncTest12:6
        SyncTest11:7
        SyncTest12:8
        SyncTest11:9*/
    }

    public static void main(String[] args) {
        
        SyncTest1.test_1();
    }
}
