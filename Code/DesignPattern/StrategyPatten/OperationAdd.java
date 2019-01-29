package DesignPattern.StrategyPatten;

/**
 * @Date: 2019/1/29 14:41
 * @Author: xuanyupan
 * @Desc: 加法
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
