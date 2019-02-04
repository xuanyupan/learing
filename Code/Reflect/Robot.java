package Reflect;

/**
 * @Date: 2019/2/3 14:48
 * @Author: xuanyupan
 * @Desc: TODO
 */
public class Robot {
    private String name;
    public void sayHi(String sentence){
        System.out.println(sentence + " " + name);
    }

    private String throwHello(String tag){
        return "Hello" + tag;
    }
}
