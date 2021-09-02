package QUESTION1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Circle");
		System.out.println("Rectangle");
		System.out.println("Square");
		System.out.println("Enter The Shape Number ");
		
		Scanner Sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		
		case 1: int radius = sc.nextInt();
		Circle obj = new Circle("Cricle",radius);
		float results = obj.calculateArea();
		System.out.println("Area of Circle is  " + results);
		break;
		
		case 2: int length = sc.nextInt();
				int breadth = sc.nextInt();
				Rectangle obj1 = new Rectangle(length,breadth);
				float results1 = obj1.calculateArea();
				System.out.println("Area Of Rectangle Is "+ results1);
				break;
		
		case 3 : int side = sc.nextInt();
				Square obj2 = new Square("Square",side);
				float results3 = obj2.calculateArea();
				System.out.println("Area Of Square Is "+ results3);
				break;
				
		
		}
	}

}
