package work7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework7Test1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File file = new File("C:\\TIA105_Workspace\\Sample.txt");
		
		long byteCount = 0 ;
		int charCount = 0 ;
		int lineCount = 0 ;
		
		byteCount = file.length();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		while((line = br.readLine()) != null) {
			lineCount++;
			charCount += line.length();
		}
		
		System.out.println("Sample.txt檔案共有" + byteCount + "個位元" + charCount + "個字元" +lineCount + "列資料");
		
		br.close();
	}
	}
