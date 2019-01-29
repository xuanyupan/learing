package DesignPattern.ProxyPattern;

/**
 * @Date: 2019/1/29 15:00
 * @Author: xuanyupan
 * @Desc: 真实的类，原本的类，实现刚才的接口
 */
public class RealSubject implements Subject {

    @Override
    public void buy() {
        System.out.println("真实的我购买东西！");
    }
}
