package Question3;

import java.util.Scanner;

import QUESTION1.Circle;
import QUESTION1.Rectangle;
import QUESTION1.Square;

public class Main {

		public static void main(String[] args) {
			System.out.println("1. reactangle");
			System.out.println("2.Square");
			System.out.println("3. Circle");
			Scanner sc = new Scanner(System.in);
			System.out.println(" endetr the  number");
			int num= sc.nextInt();
			switch(num)
			{
			case 1:
				System.out.println(" endetr the  length");
				int length=sc.nextInt();
				System.out.println(" endetr the  breadth");
				int breadth =sc.nextInt();
				Rectangle  obj= new Rectangle(length,breadth);
			
				break;

			case 2:
				System.out.println(" enter the side");
				int side = sc.nextInt();
				
				
				break;

			case 3:
				System.out.println(" enter the radius ");
				int radius= sc.nextInt();
			
				
				break;
			}

		}
}

	