package work4;

import java.util.Scanner;

public class Homework4Test4 {
	
	public static void main(String[] args) {
		
		int[][] empno = {{25, 32, 39, 19,27 },
				      {2500, 800, 5000, 1000, 1200}};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入想借的金額 :");
		int borrowmoney = sc.nextInt();
		
		int sum = 0 ;
		System.out.print("符合條件的員工編號有 : ");
		for(int i = 0 ; i < empno[0].length; i++) {
			if(empno[1][i] > borrowmoney) {
				sum++ ;
				
				System.out.print(empno[0][i] + " ");
			}
		}
		
		System.out.println("一共有"+ sum + "人");
		
		sc.close();
		
	}
}
