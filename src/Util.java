import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Util {
    public static String getFileContent(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static void writeFile(String pathFile, String content) {
        try {
            FileWriter outputFile = new FileWriter(pathFile);

            outputFile.write(content);
            outputFile.close();

            System.out.println(String.format("\"%s\" file created.", pathFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}