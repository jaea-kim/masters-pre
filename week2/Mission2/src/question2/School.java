package question2;

import java.io.IOException;
import java.util.ArrayList;


public class School {
    public static ArrayList<Student> studentData = new ArrayList<Student>();
    public static String[] subjectCode = {"국어", "수학", "영어"};
    public static void main(String[] args) throws IOException {
        File gradeFile = new File("./src/question2/input.txt");
        gradeFile.storageData();

        System.out.println(" === 학생 별 총점과 평균점수 ===");
        for (int i = 0; i <studentData.size(); i++) {
            System.out.printf("%s 학생은 %d과목을 수강했습니다.\n", studentData.get(i).getStudentInfo(), studentData.get(i).calculateSubjectNumber());
            System.out.printf("총점은 %d점이고 평균은 %d입니다.\n", studentData.get(i).totalGrade(), studentData.get(i).averageGrade());
            System.out.println("-----------------------------------------------");
        }
    }
}
