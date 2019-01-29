package DesignPattern.AdapterPattern;

/**
 * @Date: 2019/1/29 16:58
 * @Author: xuanyupan
 * @Desc: 适配器模式测试类。
 */
public class AdapterPatternDemo {
    public static void main(String[] args){
        // 类适配器，仔细看发现了类型转换
        IPhone7 iPhone7_1 = new HeadphoneAdapter_1();
        iPhone7_1.listenWithLightning();

        IPhone7 iPhone7_2 = new HeadphoneAdapter_2(new Headphone35());
        // 最后调用链路 是用适配器完成了接 lightning
        iPhone7_2.listenWithLightning();


        // 最后结果应该是一样的，都是用了3.5mm的耳机完成了听动作
    }
}
