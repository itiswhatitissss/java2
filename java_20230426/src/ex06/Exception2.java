package ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Exception2 {
	

	public static void main(String[] args) throws IOException {
	String filepath = "C:/data/sample.txt";
	String filepath2 = "C:/data/sample2.txt";
	BufferedReader reader=null;
	BufferedWriter writer=null;
	try {
		reader = new BufferedReader(new FileReader(filepath));
		writer = new BufferedWriter(new FileWriter(filepath2));
		String line = null;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
			
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}finally {
		reader.close();
	}
	}
}
		
	

