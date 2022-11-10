package question2;

import java.util.HashMap;
import java.util.Map;
import static question2.School.studentData;
import static question2.School.subjectCode;

public class Data {
    public void dataProcessing(String line) {
        Map<String, Integer> gradeData = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            if(!line.split("/")[3+i].equals("-")) {
                gradeData.put(subjectCode[i], Integer.parseInt(line.split("/")[3+i]));
                continue;
            }
            gradeData.put(subjectCode[i], -1);
        }
        studentData.add(new Student(line.split("/")[0], line.split("/")[1], line.split("/")[2], gradeData));
    }
}
