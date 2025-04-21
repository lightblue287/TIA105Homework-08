package work7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Homework7Test3 {
	
	public static void copyFile(String oldFilePath, String newFilePath) {
		try {
			Path oldFile = Paths.get(oldFilePath);
			Path newFile = Paths.get(newFilePath);
			
			if(!Files.exists(newFile)) {
				System.out.println("寫入檔案不存在,創建一個新檔案");
				
				Files.createFile(newFile);
				System.out.println("已創建新檔案");
			}
			
			Files.copy(oldFile, newFile, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("檔案複製成功");
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("檔案複製失敗");
		}
	}
	
	public static void main(String args[]) {
		String oldFilePath = "C:\\Users\\Tibame\\Desktop\\記事本1.txt";
		String newFilePath = "C:\\Users\\Tibame\\Desktop\\記事本2.txt";
		
		copyFile(oldFilePath, newFilePath);
	}
}
	