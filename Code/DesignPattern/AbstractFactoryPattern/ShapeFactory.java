package DesignPattern.AbstractFactoryPattern;

import DesignPattern.FactoryPattern.Circle;
import DesignPattern.FactoryPattern.Rectangle;
import DesignPattern.FactoryPattern.Shape;
import DesignPattern.FactoryPattern.Square;

/**
 * @Date: 2019/1/29 10:52
 * @Author: xuanyupan
 * @Desc: 图形工厂类，和颜色工厂类区分，一个类中只生产一个
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }

        // equalsIgnoreCase 忽略大小写； equals 大小写也要判断是否相同
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }

        return null;
    }
}
