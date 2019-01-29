package SYNC;

/**
 * @Date: 2019/1/28 19:17
 * @Author: xuanyupan
 * @Desc: TODO
 */
public class Account {
    String name;
    float amount;


    public Account(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    public void deposit(float amt) {
        amount = amount + amt;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void withdraw(float amt) {
        amount = amount - amt;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public float getBalance(){
        return amount;
    }

}
