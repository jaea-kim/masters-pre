package question3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservation performance = new Reservation();

        int seatType, seatNum;
        String name;
        boolean error;

        System.out.println("=== 콘서트홀 예약 시스템입니다. ===");

        while (true) {
            try {
                System.out.print("예약:1 / 조회:2 / 취소:3 / 끝내기:4 >>> ");
                int task = scanner.nextInt();

                if (task == 4) break;

                if (task == 1) {
                    System.out.print("좌석을 선택하세요. S석:1 / A석:2 / B석:3 >>> ");
                    seatType = scanner.nextInt();

                    if (seatType > 3) {
                        System.out.println("없는 번호입니다. 다시 시도해주세요.");
                        continue;
                    }

                    System.out.println(performance.printReservationInfo(seatType - 1));
                    System.out.print("예약자 이름을 입력하세요. >>> ");
                    name = scanner.next();
                    System.out.print("좌석 번호를 입력하세요.(1~10) >>> ");
                    seatNum = scanner.nextInt();
                    error = performance.reservation(name, seatNum - 1, seatType - 1);
                    System.out.println(error ? "=== 예약을 완료하였습니다. ===" : "이미 예약된 좌석입니다. 다시 시도해주세요.");
                } else if (task == 2) {
                    for (int i = 0; i < Reservation.SEAT_TYPE_NAME.length; i++) {
                        System.out.println(performance.printReservationInfo(i));
                    }
                } else if (task == 3) {
                    System.out.print("취소할 예약자 이름을 입력하세요. >>> ");
                    name = scanner.next();
                    error = performance.cancel(name);
                    System.out.println(error ? "=== 취소하였습니다 ===" : "해당 이름이 없습니다. 다시 시도해주세요.");
                } else {
                    System.out.println("없는 메뉴입니다. 다시 시도해주세요.");
                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("유효하지 않은 값을 입력하였습니다. 다시 시도해주세요.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("잘못된 번호를 입력하였습니다. 다시 시도해주세요.");
            }
        }
    }
}
