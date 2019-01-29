package DesignPattern.AdapterPattern;

/**
 * @Date: 2019/1/29 16:39
 * @Author: xuanyupan
 * @Desc: 关于适配器模式，这篇文章讲的最好 https://www.jianshu.com/p/3b1b7812aeea
 *        用了IPhone7做例子，IPhone7 用lightning接口的耳机，但是有一个转换器，转换以前的老耳机
 */
public interface IPhone7 {
    public void listenWithLightning();
}


// 总结一下，这里手机是我们的目标物，Target，target有自己的实现方法。iphone7 用的是 lightning 接口的耳机
// Headphone35 3.5mm 的耳机代表我们需要适配的物品， Adaptee， 一个3.5mm 正常查的耳机
// HeadphoneAdapter_1  2 都是我们创建的适配器，1是类适配，2是对象适配
// 类适配的适配器 实现手机接口中，写的方法是 要去适配的方法。实现手机lightning接口听功能，但是封装的是3.5妈妈耳机听
// 对象适配器 适配器中创建了3.5mm耳机对象，实现接口中是创建的对象完成的听功能