package Exercise.Offer;

/**
 * @Date: 2019/1/21 11:18
 * @Author: xuanyupan
 * @Desc: 反转字符串
 */
public class Exercise_Offer_44 {
    public String ReverseSentence(String str) {
        if (str == null || str.trim().equals(""))
            return str;
        String[] rever = str.split(" ");
        StringBuffer resultBuffer = new StringBuffer();
        for (int i = rever.length - 1; i >= 0; i--) {
            if (i != 0){
                resultBuffer.append(rever[i]).append(" ");
            }else
                resultBuffer.append(rever[i]);
        }
        return resultBuffer.toString();
    }

}
