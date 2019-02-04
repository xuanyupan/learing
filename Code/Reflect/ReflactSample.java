package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Date: 2019/2/3 14:55
 * @Author: xuanyupan
 * @Desc: TODO
 */
public class ReflactSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class rc = Class.forName("Reflect.Robot");
        Robot r = (Robot) rc.newInstance();
        System.out.println("Class name is " + rc.getName());
        r.sayHi("xuanyupan");



        Method getHello = rc.getDeclaredMethod("throwHello", String.class); // 无法获取到继承与实现接口的方法,String.class是参数类型
        getHello.setAccessible(true);  // 由于方法私有需要改为true，默认是false的.
        Object str = getHello.invoke(r,"xuanyu");
        System.out.println("getHello result is " + str);

        Method sayHi = rc.getMethod("sayHi", String.class); // 获取public类型，继承，接口实现的方法。
        sayHi.invoke(r,"Welcome xuanyu");

        Field name = rc.getDeclaredField("name"); // 获取私有变量
        name.setAccessible(true); // 只要是私有private 都要改成 true
        name.set(r,"xuanyupan");
        sayHi.invoke(r, "Welcome");
    }
}
