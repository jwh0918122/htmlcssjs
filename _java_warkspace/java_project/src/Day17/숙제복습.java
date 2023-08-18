package Day17;

import java.util.Scanner;

public class 숙제복습 {

	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력 받기.
		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지 파일 형식(jpg, png, gif, jpeg)
		 * {"java.txt","java.jpg","method.png","spring.pdf","spring.gif"}; (입력받아 배열에 넣어줘)
		 * ---이미지 파일---
		 * java.jpg
		 * method.png
		 * spring.gif
		 */
		
		Scanner scan = new Scanner(System.in);

		String[] arr = new String[5];

		// 5개의 파일명 배열로 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.print("파일 이름을 입력하세요(5개) : ");
			arr[i] = scan.next();
			if (i < 4) {
				System.out.println((arr.length - 1) - i + "개 더 입력하세요");
			}

		}
		System.out.println();
		System.out.println("---이미지 파일---");
		
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i].substring(arr[i].indexOf(".") + 1);
			if (s.equals("jpg") || s.equals("png") || s.equals("gif") || s.equals("jpeg")) {
				System.out.println(arr[i]);
			}

		}

	}

}
