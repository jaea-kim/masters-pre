package question2;

import java.util.HashMap;
import java.util.Map;
import static question2.School.subjectCode;

public class Student {
    private String studentName;
    private String studentId;
    private String majorSubject;
    private int numOfSubject = 0;
    private int totalGrade = 0;
    private Map<String, Integer> gradeData = new HashMap<>();
    Student(String studentName, String studentId, String majorSubject, Map<String, Integer> gradeData) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.majorSubject = majorSubject;
        this.gradeData = gradeData;
    }

    int calculateSubjectNumber() {
        for(int i : gradeData.values()) {
            if (i != -1) numOfSubject++;
        }
        return numOfSubject;
    }

    int totalGrade() {
        for (int i : gradeData.values()) {
            if (i != -1) totalGrade += i;
        }
        return totalGrade;
    }

    int averageGrade() {
        return totalGrade/numOfSubject;
    }

    String getStudentInfo() {
        return studentName;
    }
}
