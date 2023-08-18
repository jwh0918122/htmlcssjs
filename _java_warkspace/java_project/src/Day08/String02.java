package Day08;

public class String02 {

	public static void main(String[] args) {
		//자바의 정석.java 파일명과 확장자명을 분리하여 출력
		//파일명 : 자바의 정석
		//확장자 : java
	
	/*	내가 한거
		
		String file="자바의 정석.java";
		System.out.println("파일명 : "+ file.substring(0,file.indexOf(".")));
		System.out.println("확장자 명 : "+ file.substring(file.indexOf(".")+1));
		
		*/
		
		//강사님
		String file="자바의 정석.java";
		String fileName = file.substring(0,file.indexOf("."));
		System.out.println(fileName);
		String sufix=file.substring(file.indexOf(".")+1);
		System.out.println(sufix);
		
		

		//file에서 java가 포함되어있으면 자바파일이라고 출력
		
		/* if(file.indexOf("java")!=-1) {
			System.out.println("자바 파일");
		*/
		//contains 이용
		if(file.contains("java")==true) {
			System.out.println("자바파일");
		}
		
		}
		
		
	}


