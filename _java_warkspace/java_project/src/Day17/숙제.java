package Day17;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력 받기.
		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지 파일 형식(jpg, png, gif, jpeg)
		 * {"java.txt","java.jpg","method.png","spring.pdf","spring.gif"}; (입력받아 배열에 넣어줘)
		 * ---이미지 파일---
		 * java.jpg
		 * method.png
		 * spring.gif
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);

//		String[] fileName = {"java.txt","java.jpg","method.png","spring.pdf","spring.gif"};

		String[] fileName = new String[5];

		// 파일명 5개를 입력받아 배열에 넣기
		System.out.println("5개의 파일명을 입력하세요 : ");
		for (int i = 0; i < fileName.length; i++) {
			fileName[i] = scan.next();
			System.out.println((fileName.length-1)-i+"개 더 입력하세요");
		}

		// 입력한 fileName 배열 출력
		System.out.println("---입력하신 파일명---");
		for (int i = 0; i < fileName.length; i++) {
			System.out.println(fileName[i]);
		}

		// 이미지 파일 출력
		System.out.println("---입력한 파일 중 이미지 파일---");
		for (int i = 0; i < fileName.length; i++) {
			if (fileName[i].contains("jpg") || fileName[i].contains("png") || fileName[i].contains("pdf")
					|| fileName[i].contains("gif")) {
				System.out.println(fileName[i]);
			}
		}
	}
}
