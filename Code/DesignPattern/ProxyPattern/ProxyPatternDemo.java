package DesignPattern.ProxyPattern;

/**
 * @Date: 2019/1/29 15:08
 * @Author: xuanyupan
 * @Desc: 代理模式
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {

        Subject subject = new ProxySubject();
        subject.buy();


      /*代理购买东西
        真实的我购买东西！/


      /*结果如上所示
      *  最外层创建对象上 创建了代理类，调用代理方法。
      *  可以理解为代理方法上 创建了真实对象，然后还做了一些自己要做的处理。达到了中间件的作用
      * */

    }
}
