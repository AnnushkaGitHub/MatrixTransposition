import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOFromFile {

    public static String matpixFromFile() {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("matrix.txt")))) {
            String input = scanner.useDelimiter("\\a").next();
            return input;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

