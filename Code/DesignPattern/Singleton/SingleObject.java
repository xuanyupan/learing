package DesignPattern.Singleton;

/**
 * @Date: 2019/1/29 9:54
 * @Author: xuanyupan
 * @Desc: 单例模式
 */
public class SingleObject {

    // 自己类里面创建了这个对象
    private static SingleObject instance = new SingleObject();

    // 私有的构造函数，导致类无法被实例化
    private SingleObject() {}

    // 获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("xuanyupan - 单例模式");
    }
}
