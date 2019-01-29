package DesignPattern.Singleton;

/**
 * @Date: 2019/1/29 9:58
 * @Author: xuanyupan
 * @Desc: 最简单的单例调用
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        // 由于构造函数是 private 的是，所以无法以这种方式构建，
        // SingleObject singleObject = new SingleObject();
        // 所以单例模式核心在于创建对象方法实际是获取对象方法，在获取中创建了。
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }


}
