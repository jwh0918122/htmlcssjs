package Day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception06 {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in); //Scanner.scan이랑 같은 거임
		BufferedReader br = new BufferedReader(isr);

		String name;
		try {
			name = br.readLine();
			System.out.println(name);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
