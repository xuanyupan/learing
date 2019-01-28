package Exercise.Offer;
/**
 * @name  剑指offer第二题
 * @author xuanyupan
 */
public class Exercise_Offer_02 {
	public String replaceSpace(StringBuffer str) {
		
		int len = str.length();
		StringBuffer stringBuffer =  new StringBuffer();
		
		for (int i = 0; i < len; i++) {
			if(str.charAt(i) == ' ') {
				stringBuffer.append("%20");
			}else
				stringBuffer.append(str.charAt(i));
		}
		return String.valueOf(stringBuffer);
	}
}
