package QUESTION2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Payback Card");
		System.out.println("2.MemberShip Card");
		System.out.println("Enter The Card Number");
		int num ;
		num = sc.nextInt();
		switch (num) 
		{
		case 1: 
			System.out.println("Enter The Card Details");
			String name = sc.next();
			String [] split=name.split("l");
			System.out.println(" Enter The Pionts In Card");
			int pionts=sc.nextInt();
			System.out.println("Enetr The Total Amount");
			double amount=sc.nextLong();
			PaybackCard obj=new	PaybackCard(name, name, name, pionts, amount);
			System.out.println("ANANDHI'S playback card deatils");
			System.out.println("Card Number: "+split[1]);
			System.out.println("Pionts Earned: "+pionts);
			System.out.println("Total Amount: "+amount);
			break;
			
			case 2:
				System.out.println("Enter The Card Details");
				String name1=sc.next();
				String[]split1=name1.split("l");
				System.out.println("Enter The Rating ");
				int rating=sc.nextInt();
				System.out.println("COLIn's Membership  Card Deatils");
				MemberShipCard obj1 = new 	MemberShipCard(name1, name1, name1, rating);
				System.out.println("Card Number: "+split1[1]);
				System.out.println("Rating: "+rating);
		}
			
		
		}
	}
		

