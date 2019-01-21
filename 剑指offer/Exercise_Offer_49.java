/**
 * @Date: 2019/1/21 16:06
 * @Author: xuanyupan
 * @Desc: 字符串转换成数
 */
public class Exercise_Offer_49 {
    public int StrToInt(String str) {
        if (str.equals("") || str == null){
            return 0;
        }
        // 字符0对应48,9对应57
        int mark = 0;
        int num = 0;
        if (str.charAt(0) == '-'){
            mark = 1; // 用来后面判断是否为负号
        }

        for (int i = mark; i < str.length() ; i++) {
            if (str.charAt(i) == '+'){
                continue;
            }
            if (str.charAt(i) < '0' || str.charAt(i) > '9'){
                return 0;
            }
            num = num * 10 + str.charAt(i) - 48;
        }
        num = mark == 0 ? num : -num;
        return num;
    }
}
