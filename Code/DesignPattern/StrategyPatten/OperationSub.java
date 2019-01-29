package DesignPattern.StrategyPatten;

/**
 * @Date: 2019/1/29 14:42
 * @Author: xuanyupan
 * @Desc: TODO
 */
public class OperationSub implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
