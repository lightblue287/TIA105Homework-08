package work5;

import java.util.Random;

public class Homework5Test5 {

	public static String genAuthCode() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder authCode = new StringBuilder();
		Random random = new Random(); 
		
		for(int i = 0; i < 8; i ++) {
			authCode.append(chars.charAt(random.nextInt(chars.length())));
		}
		return authCode.toString();
	}
	
		
	public static void main(String[] args) {
		System.out.print("本次隨機產生驗證碼為 : " + genAuthCode());
	}
}
