package DesignPattern.AbstractFactoryPattern;

import DesignPattern.FactoryPattern.Shape;

/**
 * @Date: 2019/1/29 10:48
 * @Author: xuanyupan
 * @Desc: 抽象工厂类
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shapeType);
}
