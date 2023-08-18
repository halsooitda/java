package Day22;

import java.io.FileInputStream;
import java.io.IOException;

public class File02 {

	public static void main(String[] args) throws IOException {
		//FileInputStream : byte 단위 스트림
		//out.txt를 읽어오기
		byte[] b = new byte[1024]; //KB
		
		FileInputStream input = new FileInputStream("out.txt");
		input.read(b); //out파일을 b 배열에 넣어서 읽어온다
		
		//바이트 배열을 문자열로 변경하여 출력
		System.out.println(new String(b)); //배열을 스트링으로 변환
		input.close();

	}

}
