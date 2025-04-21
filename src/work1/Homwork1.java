package work1;

public class Homwork1 {
	// 第一題
	public static void main(String[] args) {
		int num1 = 6, num2 = 12;

		System.out.println("和= " + (num1 + num2));
		System.out.println("積= " + num1 * num2);

		// 第二題

		int egg = 200, dozen = 12, leftover = egg % dozen;

		System.out.println("200顆雞蛋為" + egg / dozen + "打" + leftover + "顆");

		// 第三題

		int x = 256559, day = x / (24 * 60 * 60),

				xd = x % (24 * 60 * 60), //計算天剩下的秒數

				hour = xd / (60 * 60), 

				xh = x % (60 * 60), //計算小時剩下的秒數

				min = xh / 60,

				sec = x % 60;

		System.out.println("256559秒為" + day + "天" + hour + "小時" + min + "分" + sec + "秒");

		// 第四題

		final float PI = 3.1415f, r = 5, 
				c1 = r * r * PI, // 面積
				c2 = 2 * PI * r; // 圓周
		
		System.out.println(c1);
		System.out.println(c2);
		
		// 第五題
		
		// 本利和 = 本金 * (1 + 年利率)的n次方
		
		double money = 1500000, interstingRate = 0.02;
	    int year = 10;
	    	    		
		    for(int i = 0; i < year; i++) {
			   money *= (1 + interstingRate ); 
		   }
		    System.out.printf("十年後的本利和為"+ "%.4f\n", money);
		  
		// 第六題
		 
		    System.out.println(5 + 5); // 字面上的5加5
		    System.out.println(5 + "5");// 5後面接上字串5
		    System.out.println(5 + '5');// 5+53(char i ='5')=58
	}

}
