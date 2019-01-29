package DesignPattern.AdapterPattern;

/**
 * @Date: 2019/1/29 16:46
 * @Author: xuanyupan
 * @Desc:  类的适配器兼容。
 */
public class HeadphoneAdapter_1 extends Headphone35 implements IPhone7 {

    @Override
    public void listenWithLightning() {
       this.listenWith35();  // 这里适配器适配用35
    }
}
