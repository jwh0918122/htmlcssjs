package Day17;

import java.util.Scanner;

public class 숙제강사님 {

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
		
		//파일명 5개를 입력받아 배열에 넣고 이미지 파일 검색
		Scanner scan = new Scanner(System.in);
		String[] fileName = new String[5];
		System.out.println("파일명 5개를 입력해주세요 : ");
		
		for(int i=0;i<fileName.length;i++) {
			fileName[i]=scan.next();
		}
		
		String[] img = {"jpg","png","jpeg","gif"}; //배열
		System.out.println("==이미지 파일 검색==");
		for(String tmpFile : fileName) {
			//확장자만 추출
			String search = tmpFile.substring(tmpFile.lastIndexOf(".")+1);
			if(isContains(img,search)) {
				System.out.println(tmpFile);
			}
		}			

		scan.close();
	}
	
	// isContains(배열, 찾는 값)
	// 기능 : 배열에서 찾는 문자열이 있는지 체크 : 있다면 true
	public static boolean isContains(String[] arr, String search) {
		// 배열이 없는 경우
		if (arr == null) {
			return false;
		}
		if (search == null) {
			return false;
		}
		for (String tmp : arr) {
			if (tmp.equals(search)) {
				return true;
			}
		}
		return false;
	}

}
