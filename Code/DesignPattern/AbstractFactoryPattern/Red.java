package DesignPattern.AbstractFactoryPattern;

/**
 * @Date: 2019/1/29 10:45
 * @Author: xuanyupan
 * @Desc: TODO
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红色 Red 中的 fill 方法");
    }
}
