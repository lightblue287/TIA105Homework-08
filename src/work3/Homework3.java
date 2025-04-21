package work3;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// 第一題
		System.out.println("請輸入三個整數的三角形邊長");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c) {
				System.out.println("正三角形");
			} else if (a == b || a == c || b == c) {
				System.out.println("等腰三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
		System.out.println();
		// 第二題
		// 弄出1~9的亂數
		Scanner sc2 = new Scanner(System.in);
		int i = (int) (Math.random() * 10);
		int x = 0;// 猜的數字
		System.out.println("請猜一個0~9的數字");

		while (x != i) {
			x = sc2.nextInt();
			if (x == i) {
				System.out.println("猜對了");
			} else {
				System.out.println("猜錯了");
			}

		}
		
        //第三題
		System.out.println("阿文...請問你討厭哪個數字0 ~ 9");
		Scanner sc3 = new Scanner(System.in);
		int num = sc3.nextInt();
		int num1 = 0;

		for (int y = 1; y <= 49; y++) {
			if (y % 10 != 4) {
				num1++;
			}
		}

		int[] Numbers = new int[num1];
		int index = 0;

		for (int y = 1; y <= 49; y++) {
			if (y % 10 != num) {
				Numbers[index++] = y;
			}
		}
		for (int y = 0; y < Numbers.length; y++) {
			System.out.print(Numbers[y] + " ");
		}
		System.out.print("總共有" + index + "個");
		
		sc3.close();
		sc2.close();
		sc.close();
	}
}