package work5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		
		MyRectangle myrect1 = new MyRectangle(); 
		
		myrect1.setWidth(10);
		myrect1.setDepth(20);
		
		System.out.println(myrect1.getArea());
	
		MyRectangle myrect2 = new MyRectangle(10, 20);
		
		System.out.println(myrect2.getArea());
	
	}
	
	
	
	
	

}
