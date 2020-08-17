import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Util {
    public static String getFileContent(String path) {
        String content = Constant.EMPTY_STRING;

        try {
            Scanner scanner = new Scanner(new File(path));

            while (scanner.hasNextLine()) {
                content += scanner.nextLine() + System.lineSeparator();
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return content;
    }
}
