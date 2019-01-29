package DesignPattern.AbstractFactoryPattern;

import DesignPattern.FactoryPattern.Shape;

/**
 * @Date: 2019/1/29 10:58
 * @Author: xuanyupan
 * @Desc: 颜色工厂类，和图形工厂类区分，一个类中只生产一个
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        }

        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
