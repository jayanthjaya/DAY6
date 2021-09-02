package Question3;



public class Rectangle extends Shape {
	private int length;
	private int breadth;
	public Rectangle(int length,int breadth)
	{
	  
	   this.length = length;
	   this.breadth=breadth;
	}
	public  void calculateArea()
	{
		double area=length*breadth;
		System.out.printf("the area of rectangle is:%.2f",area);
	}

}