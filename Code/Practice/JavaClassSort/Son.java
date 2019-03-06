package Practice.JavaClassSort;

import java.util.Map;

/**
 * @Author : xuanyupan
 * @Time : 2019/2/6 15:15
 * @Desc : 实例化顺序子类
 */
public class Son extends Parent {

    static {
        System.out.println("子类静态代码块");
    }

    public static String classname;

    public String shuxing;


    public Son(String classname) {
        super(classname);
        System.out.println("子类构造函数");
    }

    {
        System.out.println("子类非静态代码块");
    }

    public static void main(String[] args) {
        Son son = new Son("zilei");

      /*  得到的结果
      父类静态代码块
      子类静态代码块
      父类非静态代码块
      父类构造函数
      子类非静态代码块
      子类构造函数*/
    }
}
