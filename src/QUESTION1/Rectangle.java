package QUESTION1;

public class Rectangle extends Shape {

	private int length ;
	private int breadth ;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public Rectangle (int length, int breadth){
		super();
		this.length = length ;
		this.breadth = breadth ;
	}
	float calculateArea() {
		return length*breadth;
	}
	
	
}
