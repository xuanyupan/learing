package DesignPattern.AdapterPattern;

/**
 * @Date: 2019/1/29 16:48
 * @Author: xuanyupan
 * @Desc:   对象适配器
 */
public class HeadphoneAdapter_2 implements IPhone7 {

    private Headphone35 headphone35;  //  3.5mm 的耳机

    //  构造函数
    public HeadphoneAdapter_2(Headphone35 headphone35){
        this.headphone35 = headphone35;
    }

    @Override
    public void listenWithLightning() {
        this.headphone35.listenWith35();
    }


}
