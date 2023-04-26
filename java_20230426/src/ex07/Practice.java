package ex07;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
public class Practice {

	public static void main(String[] args) {
		 	String filepath = "c:/data/sample.txt";
	       	String fileName = "c:/data//sample2.txt";
	        BufferedReader reader=null;
	        BufferedWriter writer=null;
	        try {
	        	reader = new BufferedReader(new FileReader(filepath));
	            writer = new BufferedWriter(new java.io.FileWriter(fileName));
	            String line = null;
	            while((line=reader.readLine())!=null) {
	    			System.out.println(line);
	    			writer.write(line+"\r\n");
	    			writer.newLine();
	    		}
	            // 파일안에 문자열 쓰기
//	            bw.flush();

	            // 객체 닫기
	            reader.close();
	            writer.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
