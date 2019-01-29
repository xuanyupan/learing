package DesignPattern.FactoryPattern;

/**
 * @Date: 2019/1/29 10:36
 * @Author: xuanyupan
 * @Desc:  使用工厂类
 */
public class FactoryPatternDemo {

    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape_1 = shapeFactory.getShape("circle");
        shape_1.draw();

        Shape shape_2 = shapeFactory.getShape("rectangle");
        shape_2.draw();

        Shape shape_3 = shapeFactory.getShape("square");
        shape_3.draw();

        // 理解工厂模式，工厂方法里面根据不同参数创建不同的具体对象。在最外层使用的时候只要传参数就可以创建
    }
}
