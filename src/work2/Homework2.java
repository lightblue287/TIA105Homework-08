package work2;

public class Homework {

	public static void main(String[] args) {
		// 第一題
		int sum = 0;

		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}

		System.out.println("0-1000的偶數總和=" + sum);

		// 第二題

		int sum1 = 1;

		for (int i = 1; i <= 10; i++) {
			sum1 *= i;
		}

		System.out.println("1-10的連乘積=" + sum1);

		// 第三題

		int sum2 = 1;
		int i = 1;
		while (i <= 10) {
			sum2 *= i;
			i++;
		}

		System.out.println("1-10的連乘積=" + sum2);

		// 第四題

		for (int x = 1; x <= 10; x++) {
			System.out.print(x * x);
			if (x < 10) {
				System.out.print(" ");
			}
		}
		// 第五題
		int num = 0;
		for (int j = 1; j <= 49; j++) {
			if (j % 10 != 4) {
				num++;
			}
		}

		int[] Arrayi = new int[num];
		int index = 0;

		for (int j = 1; j <= 49; j++) {
			if (j % 10 != 4) {
				Arrayi[index++] = j;
			}
		}
		System.out.println();

		for (int j = 0; j < Arrayi.length; j++) {

			System.out.print(Arrayi[j] + " ");
		}
		System.out.print("總共有" + num + "個");

		// 第六題
		for (int y = 11; y >= 1; y--) {
			for (int j = 1; j <= y; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		// 第七題
		for (int z = 1; z <= 6; z++) {
			for (int j = 1; j <= z; j++) {
				System.out.print((char) ('A' + z - 1));
			}
			System.out.println();
		}
	}
}


