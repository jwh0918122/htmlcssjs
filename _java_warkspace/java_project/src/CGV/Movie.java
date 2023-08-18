package CGV;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Movie {
	private String movie;
	private int startTime;
	private int endTime;
	private int rows = 5; // 예매할 좌석의 행 수
	private int cols = 10; // 예매할 좌석의 열 수
	private int[][] seats = new int[rows][cols]; // 좌석 배열

//	private ArrayList<String> seatsList = new ArrayList<>(); // 전체 좌석

	public Movie(String movie) {
		this.movie=movie;
	} 

	public Movie(String movie, int startTime, int endTimes) {
		super();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = endTime;

	}
	//고객 좌석 선택 받기
	public void seatsPrint(Scanner scan) {
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
	        
	    	
//	    	//전체 좌석
//	    	public ArrayList<String> seatsList() {
//	    		char ch = 'A';
//	    		for (int i = 1; i <= 10; i++) { // 행 10
//	    			for (int j = 1; i <= 15; j++) { // 열 15
//	    				String s = String.valueOf(ch) + j;
//	    				seatsList.add(s);
//	    			}
//	    			ch++; // 'A' 부터 'J' 까지 출력
//	    		}
//	    		return seatsList;	
//	    	}
	}

	@Override
	public String toString() {
		return "Movie [movie=" + movie + ", startTime=" + startTime + ", endTime=" + endTime + ", rows=" + rows
				+ ", cols=" + cols + ", seats=" + Arrays.toString(seats) + "]";
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int[][] getSeats() {
		return seats;
	}

	public void setSeats(int[][] seats) {
		this.seats = seats;
	}
	


	


}
