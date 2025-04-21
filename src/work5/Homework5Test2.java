package work5;

public class Homework5Test2 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		System.out.println("本次亂數結果 :");
		
		for(int i = 0; i < 10; i ++) {
			int num = (int)(Math.random()*101);
			System.out.print(num + " ");
			sum += num;
			System.out.println();
		}
		
		double avg = sum / 10;
		System.out.println("本次亂數平均值 : "+ avg );
	}

}
