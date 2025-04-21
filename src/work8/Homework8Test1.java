package work8;

import java.math.BigInteger;
import java.util.*;

public class Homework8Test1 {

	
	public static void main(String[] args) {
//		1.請建立一個Collection物件並將以下資料加入:
//		  Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		  Object物件、“Snoopy”、BigInteger(“1000”)
		
		List collection = new ArrayList();
		collection.add(100);  
		collection.add(3.14); 
		collection.add(21L);  
		collection.add(Short.parseShort("100")); 
		collection.add(5.1);  
		collection.add("Kitty"); 
		collection.add(100);  
		collection.add(new Object()); 
		collection.add("Snoopy"); 
		collection.add(new BigInteger("1000")); 
		
		System.out.println(collection);

//		2.印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

		for(int i = 0; i < collection.size(); i++) {
			System.out.println(collection.get(i));
		}
		
		for(Object obj : collection) {
			System.out.println(obj);
		}
		
//		3.移除不是java.lang.Number相關的物件
		Iterator iterator2 = collection.iterator();
		while(iterator2.hasNext()) {
			if(!(iterator2.next() instanceof Number)){
				iterator2.remove();
			}
		}
		
//		4.再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		System.out.println(collection);

	}

}
