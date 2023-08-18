package Day22;

import java.io.File;

public class File05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\장원희\\_java_warkspace\\java_project\\out2.txt");
		String fileName = f.getName(); //파일의 경로 빼고 이름만 추출
		System.out.println("경로를 제외한 파일 이름 : "+fileName);
		System.out.println("경로를 포함한 파일이름 : "+f.getPath());
		System.out.println("경로를 포함한 파일 이름 : "+f.getAbsolutePath());
		System.out.println("경로만 : "+f.getParent());
		System.out.println("파일 구분자 : "+File.separator); //자주 사용
		
		//f에 대한 경로 (드라이브,경로,파일명,확장자)
		//문자 추출을 통해서 분리
		
		String fstr = f.toString();
		System.out.println("드라이브 전체 경로 : "+fstr);
		System.out.println("드라이브 : "+fstr.substring(0,fstr.indexOf(File.separatorChar)));
		System.out.println("경로 : "+fstr.substring(fstr.indexOf(File.separator)+1,
				fstr.lastIndexOf(File.separator)));
		System.out.println("파일명 : "+fstr.substring(fstr.lastIndexOf(File.separator)+1,fstr.indexOf(".")));
		System.out.println("확장자 : "+fstr.substring(fstr.lastIndexOf(".")+1));
		
		//문자열의 추가나 변경 등 많은 작업을 할 경우 String => StringBuffer 많이 사용.
		StringBuffer sb = new StringBuffer();
		//append 추가
		sb.append("Hello");
		sb.append(" ");
		sb.append("World~!!");
		
//		String a = sb   => sb자체가 StringBuffer 객체여서 String 변수로 안들어감
//		String a = sb.toString()  => 넣으려면 이렇게 넣어야함
		
		
		//insert 사이에 추가
		sb.insert(0, "JAVA ");
		sb.insert(sb.indexOf("H"), "Hi~~!! ");	
//		sb.delete(0,sb.indexOf("!!")+1);
		System.out.println(sb.toString());
		
		
		//StringBuffer 안쓴 경우(속도도 느리고 용량도 많이 차지함)
		String b = "";
		b+="Hello~!!";
		b+=" ";
		b+="World~!!";
		System.out.println(b);
	}

}
