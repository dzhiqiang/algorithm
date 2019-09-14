package dzq;


/**
 * 最长不含重复字符的子字符串
 */
public class Practise_22 {

    public static void main(String[] args) {

        String str = "arabcacfr";
        //            012

        int max = getMax(str);

        System.out.println(max);

    }

    private static int getMax(String str) {

        int max = 0;
        int currentLength = 0;
        int[] strArray = new int[26];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            int charValue = strArray[value-97];
            if (charValue == -1 || i - charValue > currentLength) {
                currentLength++;
            } else {
                currentLength = i - charValue;
            }
            strArray[value - 97] = i;
            max = currentLength > max ? currentLength : max;
        }
        return max;
    }


}
