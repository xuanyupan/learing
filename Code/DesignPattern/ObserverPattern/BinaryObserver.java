package DesignPattern.ObserverPattern;

/**
 * @Date: 2019/1/29 11:52
 * @Author: xuanyupan
 * @Desc:  实体观察者类, 转二进制
 */
public class BinaryObserver extends Observer{

    @Override
    public void update() {
        System.out.println("Binary Observer update : " + Integer.toBinaryString(subject.getState()));
    }

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
}
