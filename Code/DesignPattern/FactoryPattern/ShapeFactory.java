package DesignPattern.FactoryPattern;

/**
 * @Date: 2019/1/29 10:31
 * @Author: xuanyupan
 * @Desc:  创建图形工厂
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){

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
