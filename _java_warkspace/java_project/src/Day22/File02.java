package Day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File02 {

	public static void main(String[] args) throws IOException {
		// FileInputStream : 바이트 단위의 스트림
		// out.txt를 읽어오기
		
		//out.txt파일을 바이트 단위로 불러오는 거
		byte[] b = new byte[1024]; //KB
		FileInputStream input = new FileInputStream("out.txt"); 
				
		input.read(b); //읽어 오는거
	
		//바이트 배열을 문자열로 변경하여 출력(바이트를 그냥 출력하면 깨져서 나옴)
		System.out.println(new String(b));
		input.close();
		
	}

}
