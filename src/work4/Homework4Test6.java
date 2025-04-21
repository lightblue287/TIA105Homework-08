package work4;

public class Homework4Test6 {
	public static void main(String[] args) {
		
		int[][] scores = {
	            {10, 35, 40, 100, 90, 85, 75, 70},  
	            {37, 75, 77, 89, 64, 75, 70, 95},
	            {100, 70, 79, 90, 75, 70, 79, 90},
	            {77, 95, 70, 89, 60, 75, 85, 89},
	            {98, 70, 89, 90, 75, 90, 89, 90},
	            {90, 80, 100, 75, 50, 20, 99, 75}
	        };
		int studentno = scores[0].length;
		int exams = scores.length;
		int[] numberOne = new int[studentno];
		
		for(int i = 0; i < exams; i++) {
			int maxScore = 0 ;
			
			for(int j = 0; j < studentno ; j++) {
				if(scores[i][j] > maxScore) {
					maxScore = scores[i][j];
				}
			}
			
			for(int j = 0; j < studentno; j++) {
				if(scores[i][j] == maxScore) {
					numberOne[j]++;
				}
			}
		}
		
		for(int i = 0; i < studentno; i++) {
			System.out.println((i+1) + "號同學考到位高分的次數為"+ numberOne[i] +"次");
		}
	}
}
