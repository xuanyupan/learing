package SYNC;

/**
 * @Date: 2019/1/28 16:56
 * @Author: xuanyupan
 * @Desc: 存在有被sync同步，也有不被sync同步的代码块
 */
public class SyncTest2 implements Runnable {
    private volatile static int count = 0;

    public void run() {
        String threadName = Thread.currentThread().getName();

        if ( threadName.equals("thread_1")){
            // synchronized (this) {}  是同步代码块， 被锁住的部分是同步代码块，没有被锁住的部分还是可以用的
            // 下面else if 部分没有被锁住还是可以被访问的，所以当是 thread_2的时候还是可以访问的，所以会出现
            // 两个线程都会有。
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " count: " + (count++));
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }else if (threadName.equals("thread_2")){
            for (int j = 0; j < 5; j++){
                try{
                    System.out.println(Thread.currentThread().getName() + " j: " + j);
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String arg[]){
        SyncTest2 threadSync = new SyncTest2();
        Thread thread1 = new Thread(threadSync, "thread_1");
        Thread thread2 = new Thread(threadSync, "thread_2");
        thread1.start();
        thread2.start();
        /*  结果，
        thread_1 count: 0
        thread_2 j: 0
        thread_2 j: 1
        thread_1 count: 1
        thread_1 count: 2
        thread_2 j: 2
        thread_2 j: 3
        thread_1 count: 3
        thread_2 j: 4
        thread_1 count: 4*/
    }
}
