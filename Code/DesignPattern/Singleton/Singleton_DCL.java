package DesignPattern.Singleton;

/**
 * @Date: 2019/1/29 10:07
 * @Author: xuanyupan
 * @Desc: 单例 双重校验锁 double check lock
 */
public class Singleton_DCL {
    // 自己创建了这个实例
    private volatile static Singleton_DCL singleton_dcl;

    // 自己实现 private 的构造函数
    private Singleton_DCL(){}

    public static Singleton_DCL getInstance(){
        if (singleton_dcl == null){
            synchronized (Singleton_DCL.class) {
                if (singleton_dcl == null) {
                    singleton_dcl = new Singleton_DCL();
                }
            }
        }
        return singleton_dcl;
    }
}
