package DesignPattern.FactoryPattern;

/**
 * @Date: 2019/1/29 10:28
 * @Author: xuanyupan
 * @Desc: 矩形
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("矩形 Rectangle 中的 draw 方法");
    }
}
