package CGV;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int rows = 5; // 예매할 좌석의 행 수
        int cols = 10; // 예매할 좌석의 열 수
        int[][] seats = new int[rows][cols]; // 좌석 배열

        Scanner scan = new Scanner(System.in);

        while (true) {
            // 좌석 배치 출력
            System.out.println("==== 영화 예매 ====");
            char c = 'A'; // 좌석 행 알페벳 순으로 표시
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (seats[i][j] == 0) {
                        System.out.printf("[%s%02d]",c,j+1); // 빈 좌석 표시
                    } else {
                        System.out.printf("[%3s]","---"); // 예약된 좌석 표시
                    }
                }
                c++;
                System.out.println();
            }

            // 좌석 예약
            System.out.print("예매할 좌석의 행 번호를 입력하세요 (1-" + rows + "): ");
            int row = scan.nextInt();
            System.out.print("예매할 좌석의 열 번호를 입력하세요 (1-" + cols + "): ");
            int col = scan.nextInt();

            // 좌석 예매 확인 및 처리
            if (row >= 1 && row <= rows && col >= 1 && col <= cols) {
                if (seats[row - 1][col - 1] == 0) {
                    seats[row - 1][col - 1] = 1; // 좌석 예매 처리
                    System.out.println("예매가 완료되었습니다.");
                } else {
                    System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
                }
            } else {
                System.out.println("올바른 좌석 번호를 입력해주세요.");
            }

            // 계속 예매할지 여부 확인
            System.out.print("더 예매하시겠습니까? (예/아니오): ");
            String continueBooking = scan.next();
            if (!continueBooking.equalsIgnoreCase("예")) {
                break;
            }
        }

        System.out.println("예매를 종료합니다.");
        scan.close();
    }
}
