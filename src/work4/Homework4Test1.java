package work4;

public class Homework4Test1 {
	//第一題
	public static void main(String[] args) {
		
		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
	    int sum =0 ;
	    
	    for(int num : arr) {
	    	sum += num;
	    }
	    
	    double avg = sum / arr.length;	
	    System.out.println("平均值 = " + avg);
	    System.out.println("大於平均的元素 = ");
	    for(int num : arr) {
	    	if(num > avg) {
	    		System.out.print(num + " ");
	    	}
	    }
	}

}

