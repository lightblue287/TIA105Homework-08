package work6;

import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean input = false;
		
		while(!input) {
		try {
			System.out.println("請輸入 x 的值 : ");
			int x = sc.nextInt();
			
			System.out.println("請輸入y的值 : ");
			int y = sc.nextInt();
			
			int z = Calculator.powerXY(x, y);
			System.out.println(x + "的" + y + "次方 = " + z );
			input = true ; 
			
		} catch (CalException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("輸入格式不正確");
			sc.next();
		}
	}
		sc.close();
	}
}
