package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
//	(1)
		MyRectangle mr1 = new MyRectangle();
		mr1.setDepth(20);
		mr1.setWidth(10);
		mr1.getArea();
		
//		(2)
		MyRectangle mr2 = new MyRectangle(10,20);
		mr2.getArea();
	}
}
