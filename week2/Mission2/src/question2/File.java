package question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class File {
    String filePath;
    File(String filePath) {
        this.filePath = filePath;
    }
    void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            //성적표에 저장
            System.out.println(line);
        }
        br.close();
    }
}
