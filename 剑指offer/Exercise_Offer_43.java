/**
 * @Date: 2019/1/21 11:10
 * @Author: xuanyupan
 * @Desc: 左移字符串
 */
public class Exercise_Offer_43 {
    public String LeftRotateString(String str,int n) {
        if (n > str.length())
            return "";
        if (n == 0 || n == str.length()){
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.substring(n, str.length()));
        stringBuffer.append(str.substring(0, n));
        return stringBuffer.toString();

    }

}
