package question2;

import java.util.HashMap;
import java.util.Map;

import static question2.School.*;

public class Data {
    private static Data dataCenter = new Data();
    private static int defultStudentId = 1000;


    private Data() { }
    static Data getInstance() {
        return dataCenter;
    }
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

    public void modifyData(String studentName, String line) {
        String[][] data = new String[line.split("/").length][2];
        for (int i = 0; i < line.split("/").length; i++) {
            data[i][0] = line.split("/")[i].split(" ")[0];
            data[i][1] = line.split("/")[i].split(" ")[1];
        }

        for (int i = 0; i < studentData.size(); i++) {
                if (studentData.get(i).getStudentInfo().equals(studentName)) {
                    for(String[] d : data) studentData.get(i).getGradeData().put(d[0], Integer.parseInt(d[1]));
                    //gradeFileManagement.modifyFile(studentName,data, i+1);
                    break;
                }
        }
    }

    public void addData(String studentName, String majorSubject, String line) {
        Map<String, Integer> gradeData = new HashMap<>();
        String[] data = line.split("/");

        for (int i = 0; i < data.length; i++) {
            if (!data[i].split(" ")[1].equals("-")) {
                gradeData.put(subjectCode[i], Integer.parseInt(data[i].split(" ")[1]));
                continue;
            }
            gradeData.put(subjectCode[i], -1);
        }
        System.out.println((gradeData));
        studentData.add(new Student(studentName, makeStudentId(), majorSubject, gradeData));
    }

    private String makeStudentId() {
        return Integer.toString(studentData.size() + defultStudentId);
    }

}
