public class Encryptor {
    public static String getEncrypt(String content) {
        String encryptContent = Constant.EMPTY_STRING;

        for (char letter : content.toCharArray()) {
            int newAsciiValue = (int) letter;

            if (letter != Constant.CARRIAGE_RETURN_CHAR && letter != Constant.LINE_FEED_CHAR) {
                newAsciiValue += Constant.JUMP_VALUE;
            }

            encryptContent += Character.toString(newAsciiValue > Constant.HIGHEST_ASCII_INDEX ? Constant.LOWEST_ASCII_INDEX : newAsciiValue);
        }

        return encryptContent;
    }

    public static String getDecrypt(String content) {
        String decryptContent = Constant.EMPTY_STRING;

        for (char letter : content.toCharArray()) {
            int newAsciiValue = (int) letter;

            if (letter != Constant.CARRIAGE_RETURN_CHAR && letter != Constant.LINE_FEED_CHAR) {
                newAsciiValue -= Constant.JUMP_VALUE;
            }

            decryptContent += Character.toString(newAsciiValue < Constant.LOWEST_ASCII_INDEX ? Constant.HIGHEST_ASCII_INDEX : newAsciiValue);
        }

        return decryptContent;
    }
}
