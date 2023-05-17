package java_20230509;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
//		String path = "C:\\works\\java2\\data\\data.dat";
		String path = "C:/works/data.dat";
		
		FileOutputStream out = new FileOutputStream(path);
		out.write(7);
		out.write(10);
		out.close();
	}

}
