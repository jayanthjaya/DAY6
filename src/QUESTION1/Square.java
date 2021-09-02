package QUESTION1;

public class Square extends Shape {

	int side ;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	Square (String name, int side){
		this.side = side ;
	}
	float calculateArea() {
		return side*side ;
	}
	
}
