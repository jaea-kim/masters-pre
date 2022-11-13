package question2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class School {
    public static ArrayList<Student> studentData = new ArrayList<Student>();
    public static String[] subjectCode = {"국어", "수학", "영어"};

    public static void main(String[] args) throws IOException {
        FileManagement gradeFileManagement = new FileManagement("./src/question2/input.txt");
        Data dataCenter = Data.getInstance();
        gradeFileManagement.storageData(dataCenter);

        System.out.println(" === 학생 별 총점과 평균점수 ===");
        for (int i = 0; i <studentData.size(); i++) {
            System.out.printf("%s 학생은 %d과목을 수강했습니다.\n", studentData.get(i).getStudentInfo(), studentData.get(i).calculateSubjectNumber());
            System.out.printf("총점은 %d점이고 평균은 %d입니다.\n", studentData.get(i).totalGrade(), studentData.get(i).averageGrade());
            System.out.println("-----------------------------------------------");
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("실행할 기능을 선택해주세요 (0: 조회 1: 수정, 2: 추가, 3: 종료) >>> ");
            int function = scanner.nextInt();
            //scanner.

            if (function == 3) break;
            if (function == 1) {
                //System.out.println("수정할 이름을 입력하세요. >>>");
                //String name = scanner.nextLine();
                //System.out.println("수정할 과목명과 점수를 입력하세요.ex) 국어 50/수학 40 >>>");
                //String line = scanner.nextLine();
                //dataCenter.modifyData(name, line);
                dataCenter.modifyData("Lee", "수학 80/국어 50");
            }
            else if (function == 2) {
                //System.out.print("추가할 이름을 입력하세요. >>>");
                //String name = scanner.next();
                //System.out.print("전공 과목을 입력하세요. >>>");
                //String majorSubject = scanner.next();
                //System.out.print("추가할 과목명과 점수를 입력하세요. ex) 국어 50/수학 40 >>>");
                //String line = scanner.next();
                dataCenter.addData("Park", "국어", "국어 90/수학 -/영어 100");
            }
        }
    }
}
