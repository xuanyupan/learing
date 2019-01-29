package DesignPattern.ObserverPattern;

/**
 * @Date: 2019/1/29 12:58
 * @Author: xuanyupan
 * @Desc: 观察者模式
 */
public class ObserverPatterDemo {
    public static void main(String[] args){
        Subject subject = new Subject();

        // 创建观察者，有哪些观察者，哪些观察者会进行监控观察，满足就会自动调用各自的方法
        HexaObserver hexaObserver = new HexaObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        System.out.println("Test -- xuanyu -- 15");
        subject.setState(15);  // 调用 setState --> notifyAllObservers --> update，具体里面进行转换 二进制与 16 进制
        subject.setState(10);

    }
}
