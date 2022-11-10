package question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
    String filePath;
    Data dataCenter = new Data();

    File(String filePath) {
        this.filePath = filePath;
    }
    void storageData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        br.readLine(); //제목..
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            dataCenter.dataProcessing(line);
        }
        br.close();
    }
}
