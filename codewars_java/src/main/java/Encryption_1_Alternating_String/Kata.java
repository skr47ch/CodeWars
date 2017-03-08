package Encryption_1_Alternating_String;

public class Kata {

    public static String encrypt(final String text, final int n) {
        StringBuilder strEven = new StringBuilder("");
        StringBuilder strOdd = new StringBuilder("");
        String result = text;

        for (int j = 0; j < n; j ++) {
            strEven.setLength(0);
            strOdd.setLength(0);

            for (int i = 0; i < result.length(); i++) {
                if (i % 2 != 0) {
                    strEven.append(result.charAt(i));
                } else {
                    strOdd.append(result.charAt(i));
                }
            }
            result = strEven.toString() + strOdd.toString();
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        StringBuilder strEven = new StringBuilder("");
        StringBuilder strOdd = new StringBuilder("");
        String result = encryptedText;

        for (int j = 0; j < n; j ++) {
            strEven.setLength(0);
            strOdd.setLength(0);

            for (int i = 0; i < result.length(); i++) {
                if (i % 2 != 0) {
                    strEven.append(result.charAt(i));
                } else {
                    strOdd.append(result.charAt(i));
                }
            }
            result = strEven.toString() + strOdd.toString();
        }
        return result;
    }
}
