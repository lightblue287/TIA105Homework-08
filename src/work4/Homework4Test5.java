package work4;

import java.util.Scanner;

public class Homework4Test5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入年月日(格式為:yyyy mm dd)");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(year % 4 == 0) {
			daysOfMonth[2] = 29;
		}
		
		int daysOfYear = day;
		for(int i = 1; i < month; i++) {
			daysOfYear += daysOfMonth[i];
		}
		
		System.out.println("輸入的日期為當年的第" + daysOfYear + "天");
		
		sc.close();
	}
}
