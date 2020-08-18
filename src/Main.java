public class Main {
    public static void main(String[] args) {
        String content = Util.getFileContent(Constant.INPUT_FILE_PATH);
        String encryptedFileContent = Encryptor.getEncrypt(content);
        String decryptedFileContent = Encryptor.getDecrypt(encryptedFileContent);

        System.out.println("Encrypted File:");
        System.out.println(encryptedFileContent);
        System.out.println("---");
        System.out.println("Decrypted File:");
        System.out.println(decryptedFileContent);
    }
}
