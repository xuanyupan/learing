package DesignPattern.AbstractFactoryPattern;

import DesignPattern.FactoryPattern.Shape;

/**
 * @Date: 2019/1/29 11:07
 * @Author: xuanyupan
 * @Desc: 最后的测试创建类
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("red");
        color.fill();

        // 最后理解出来就是 抽象工厂模式 实际上就是 工厂模式 向上层抽象，可以抽象出多个工厂。
        // 工厂层次就是工厂模式
    }
}
