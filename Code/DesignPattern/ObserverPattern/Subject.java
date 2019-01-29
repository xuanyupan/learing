package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date: 2019/1/29 11:47
 * @Author: xuanyupan
 * @Desc: subject 类
 */
public class Subject {
    // subject 类中有一个 观察者list
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    // 在最外层  观察者模式 类中调用了这个方法，注意查看链路
    public void setState(int state) {
        this.state = state;

        //  调用set 方法会 实际调用 update， 到具体每一个观察中去
        notifyAllObservers();
    }

    // attach 方法 添加到 list中去
    public void attach(Observer observer){
        observers.add(observer);
    }

    // 调用 update方法
    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
