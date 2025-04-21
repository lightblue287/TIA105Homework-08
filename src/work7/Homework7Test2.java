package work7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Homework7Test2 {

	public static void main(String[] args) throws IOException {
		
		String fileName = "C:\\TIA105_Workspace\\Data.txt";
		
		FileWriter fw = null;
		
		File file = new File(fileName);
		
		if(!file.exists()) {
			file.createNewFile();
			System.out.println(fileName + "檔案已建立");
		}
		
		fw = new FileWriter(fileName, true);
		
		for(int i = 0; i < 10; i++) {
			int randomNum = (int)(Math.random()*1000)+ 1;
			fw.write(randomNum + " ");
		}
		fw.flush();
		System.out.println("數字已成功寫入");
		fw.close();	
	}
	
	
}
