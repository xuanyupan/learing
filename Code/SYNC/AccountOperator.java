package SYNC;

/**
 * @Date: 2019/1/28 19:18
 * @Author: xuanyupan
 * @Desc: TODO
 */
public class AccountOperator implements Runnable {
    private Account account;
    // 构造函数
    public AccountOperator(Account account){
        this.account = account;
    }

    public void run() {
        // 这里对 account 进行了加锁
        synchronized (account) {
            account.deposit(500);
            account.withdraw(500);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }

}

class Main{
    public static void main(String[] args){
        Account account = new Account("xuanyu", 1000.0f);
        AccountOperator accountOperator = new AccountOperator(account);

        final int thread_num = 5;
        Thread[]  threads = new Thread[thread_num];
        for (int i = 0; i < thread_num; i++) { // 启动五个线程，执行线程方法
            threads[i] = new Thread(accountOperator, "Thread" + i);
            threads[i].start();
        }
    }
}