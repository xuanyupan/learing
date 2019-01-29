package DesignPattern.StrategyPatten;

/**
 * @Date: 2019/1/29 14:44
 * @Author: xuanyupan
 * @Desc: 策略模式
 */
public class StrategyPatternDemo {
    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println(" 10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSub());
        System.out.println(" 10 - 5 = " + context.executeStrategy(10, 5));
    }
}
