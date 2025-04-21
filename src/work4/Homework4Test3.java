package work4;

public class Homework4Test3 {

	public static void main(String[] args) {
	String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
	int sum = 0; 
	
	String vowels = "aeiou";
	
	for (String str : planets) {
		for(char ch : str.toCharArray()) {
			if(vowels.indexOf(ch) != -1 ) {
				sum++;
			}
		}
	}
	
	System.out.println("母音總共有 : " + sum + "個");
  }
}