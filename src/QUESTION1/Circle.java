package QUESTION1;

public class Circle extends Shape {

	int radius ;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	 Circle (String name,int radius){
		
		super();
		
		this.radius = radius ;
	} 
	float calculateArea() {
		return (3.14f*radius*radius);
	}
	
	
}
