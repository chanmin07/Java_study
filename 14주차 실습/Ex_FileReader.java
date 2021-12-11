import java.io.*;

public class Ex_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName = "C://Users//uzer//Desktop//test2.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr  = new FileReader(fileName);

			int data =0;

			// FileInputStream을 이용해서 파일내용을 읽어 화면에 출력한다.
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();

			// FileReader를 이용해서 파일내용을 읽어 화면에 출력한다.
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();				

		} catch (IOException e) {
				e.printStackTrace();		
		}
	}

}

