package work5;

import java.util.Scanner;

public class Homework5Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入長方形的寬與高 : ");
		int width = sc.nextInt();
		int height= sc.nextInt();
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
