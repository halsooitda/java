package Day22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File03 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader : 보조스트림
		 * 라인 단위로 읽어주는 보조스트림
		 * 더이상 읽을 것이 없다면 null을 리턴
		 * 
		 * 기반 스트림 / 보조 스트림
		 * 기반 스트림 : 대상에 직접 자료를 읽고 쓰는 기능을 하는 스트림
		 * 보조 스트림 : 직접 읽고 쓰는 기능없이 추가적인 기능을 더해주는 스트림
		 * 보조스트림은 항상 기반스트림이나 다른 스트림을 같이 끼고 생성
		 * 매개변수로 포함되는 경우가 많다.
		 * */ 

		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		while(true) {
			String line = br.readLine(); //한 라인(줄)씩 읽기
			if(line == null) { //더이상 읽을 라인이 없다면
				break;
			}
			System.out.println(line);
		}
		br.close();
		
	}

}
