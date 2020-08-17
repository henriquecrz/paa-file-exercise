public class Main {
    public static void main(String[] args) {
        String content = Util.getFileContent(Constant.INPUT_FILE_PATH);
        Encryptor encryptor = new Encryptor();
        String encryptedFileContent = encryptor.getEncrypt(content);
        String decryptedFileContent = encryptor.getDecrypt(encryptedFileContent);

        System.out.println("Encrypted File:");
        System.out.println(encryptedFileContent);
        System.out.println("---");
        System.out.println("Decrypted File:");
        System.out.println(decryptedFileContent);
    }
}
