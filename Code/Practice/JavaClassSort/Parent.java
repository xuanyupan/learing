package Practice.JavaClassSort;

/**
 * @Author : xuanyupan
 * @Time : 2019/2/6 15:10
 * @Desc : 类实例化顺序 - 父类
 */
public class Parent {
    static {
        System.out.println("父类静态代码块");
    }

    public static String classname;

    public String shuxing;

    public Parent(String classname){
        this.classname = classname;
        System.out.println("父类构造函数");
    }

    {
        System.out.println("父类非静态代码块");
    }



}
