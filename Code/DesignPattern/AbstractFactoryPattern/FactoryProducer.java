package DesignPattern.AbstractFactoryPattern;

/**
 * @Date: 2019/1/29 11:05
 * @Author: xuanyupan
 * @Desc:  图形和颜色再向上兼容一层的工厂类
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
