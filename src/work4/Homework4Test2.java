package work4;

import java.util.Scanner;

public class Homework4Test2 {
	
	public static void main(String args[]) {
		System.out.print("請輸入要反轉的字串 : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuilder s1 = new StringBuilder(s).reverse();
		System.out.println("反轉後的字串為 : " + s1);
		
		sc.close();
	}

}
