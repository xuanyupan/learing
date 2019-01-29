package DesignPattern.ObserverPattern;

/**
 * @Date: 2019/1/29 11:49
 * @Author: xuanyupan
 * @Desc: observer 观察者类
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
