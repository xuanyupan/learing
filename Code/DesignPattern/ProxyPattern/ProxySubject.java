package DesignPattern.ProxyPattern;

/**
 * @Date: 2019/1/29 15:03
 * @Author: xuanyupan
 * @Desc: 代理实现类，代理实际上起到中间件的作用
 */
public class ProxySubject implements Subject {


    @Override
    public void buy() {
        RealSubject realSubject = new RealSubject();
        this.buyByProxy();  // 代理购买东西, 中间件自己处理的事情

        realSubject.buy();  // 真实的我需要购买东西，这是原处理逻辑。

    }

    public void buyByProxy(){
        System.out.println("代理购买东西");
    }

}
