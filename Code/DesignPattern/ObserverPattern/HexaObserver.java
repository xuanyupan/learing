package DesignPattern.ObserverPattern;

/**
 * @Date: 2019/1/29 12:55
 * @Author: xuanyupan
 * @Desc: 实体观察类，转16进制
 */
public class HexaObserver extends Observer{
    @Override
    public void update() {
        System.out.println("Hexa Observer update : "+ Integer.toHexString(subject.getState()).toUpperCase());
    }

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
}
