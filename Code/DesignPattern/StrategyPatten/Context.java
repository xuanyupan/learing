package DesignPattern.StrategyPatten;

/**
 * @Date: 2019/1/29 14:42
 * @Author: xuanyupan
 * @Desc: TODO
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
