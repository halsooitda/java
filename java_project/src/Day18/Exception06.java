package Day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception06 {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in); // 입력받을 수 있는
		BufferedReader br = new BufferedReader(isr);
		
		String name;
		try {
			name = br.readLine(); // 입력받아서
			System.out.println(name); // 찍겠다
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // throws를 포함하고 있다

	}

}
