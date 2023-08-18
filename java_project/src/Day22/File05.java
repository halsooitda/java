package Day22;

import java.io.File;

public class File05 {

	public static void main(String[] args) {
		
		File f = new File("D:\\강서연\\_Java_workspace\\java_project\\out2.txt");
		String fileName = f.getName(); //파일의 경로 빼고 이름만 추출
		System.out.println("경로를 제외한 파일이름: "+fileName);
		System.out.println("경로를 포함한 파일이름: "+ f.getPath());
		System.out.println("경로를 포함한 파일이름: "+ f.getAbsolutePath());
		System.out.println("경로만: "+f.getParent());
		System.out.println("파일 구분자 : "+File.separator); //파일구분자->사용하는 곳에 따라달라짐, 자주 사용
		System.out.println();
		
		//f에 대한 경로 (드라이브, 경로, 파일명, 확장자)
		//문자 추출을 통해서 분리
		String fstr = f.toString();
		System.out.println("드라이브 전체 경로: "+fstr);
		System.out.println("드라이브: "+fstr.substring(0, fstr.indexOf(File.separator)));
		System.out.println("경로: "+fstr.substring(fstr.indexOf(File.separator)+1, 
				fstr.lastIndexOf(File.separator)));
		System.out.println("파일이름: "+fstr.substring(fstr.lastIndexOf(File.separator)+1,
				fstr.indexOf(".")));
		System.out.println("확장자: "+fstr.substring(fstr.lastIndexOf(".")+1));
		
		//문자열의 추가나 변경 등 많은 작업을 할 경우 String => StringBuffer 많이 사용.
		StringBuffer sb = new StringBuffer();
		//append 추가
		sb.append("Hello");
		sb.append(" ");
		sb.append("World~!!");
		//insert 사이에 추가
		sb.insert(0, "JAVA "); //0번지에 추가
		sb.insert(sb.indexOf("H"), "Hi~!! ");
		sb.delete(0, sb.indexOf("!!")); //!!전까지 삭제
		
		System.out.println(sb.toString());
		String a = sb.toString();
		System.out.println(a);
		
		String b = "";
		b+= "Hello~!!";
		b+= " ";
		b+= "World~!!";
		System.out.println(b);
		
	}

}
