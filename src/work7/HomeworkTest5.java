package work7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class HomeworkTest5 {
	
	public static void main(String[] args) throws Exception {
		
		File f = new File("C:/data/Object.ser");
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while(true) {
				((Animal)ois.readObject()).speak();
			}
		}catch (EOFException e) {
			System.out.println("資料讀取完畢");
		}
		ois.close();
		fis.close();
	}
	
}
