package question2;

import java.util.ArrayList;
import java.util.Scanner;

public class MonthSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Day[] day = new Day[30];
        for (int i = 0; i < day.length; i++) {
            day[i] = new Day();
        }
        int selectedDay;

        System.out.println("이번달 스케쥴 관리 프로그램");

        while(true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
            int task = scanner.nextInt();

            if (task == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            if(task == 1) {
                System.out.print("날짜(1~30) >> ");
                selectedDay = scanner.nextInt();
                System.out.print("할일(빈칸없이 입력) >> ");
                String work = scanner.next();
                day[selectedDay].saveTodayWork(work);
                continue;
            } else if (task == 2) {
                System.out.print("날짜(1~30) >> ");
                selectedDay = scanner.nextInt();
                System.out.println(selectedDay + "일의 할 일은 " + day[selectedDay].hasWork());
            }
        }
    }
}
