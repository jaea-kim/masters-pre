package question2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class School {
    public static void main(String[] args) throws IOException {
        File gradeFile = new File("./src/question2/input.txt");
        gradeFile.readFile();
    }
}
