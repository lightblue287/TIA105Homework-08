package work7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Homework7Test4 {
	
	public static void main(String[] args) {
		File f = new File("C:/data");
		
			if(!f.exists()) {
				f.mkdirs();
			}
			
		File file = new File("C:/data/Object.ser");
		
		Dog dog = new Dog("嘎逼");
		Cat cat = new Cat("mami");
		
		try(FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(dog);
			oos.writeObject(cat);
			System.out.println("檔案寫入成功");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("檔案寫入失敗");
		}
		
	}

}
