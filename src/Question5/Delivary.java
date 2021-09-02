package Question5;

public class Delivary {
	
	
	public void displayDeliveryDetails(String bowler,String batsman)
	{
		System.out.println("The Last Name Of Bowleris: " +bowler);
		System.out.println("The Last Name Of Batsamn is :" +batsman);
	}
	public void displayDeliveryDetails(long runs,long del)
	{
		System.out.println("Enter The No. Of Deliveries: " +del);
		System.out.println("Enter The No. Of Runs : " +runs);
		if(runs==4||runs==6)
		{
			System.out.println("It's A  Bonundary");
		}else
		{

		}

	}
}
