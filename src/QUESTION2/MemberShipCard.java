package QUESTION2;

public class MemberShipCard extends Card {

	private Integer rating ;
	

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	public MemberShipCard(String holderName, String cardNumber, String expiryDate,int rating) {
		super(holderName, cardNumber, expiryDate);
		
		this.rating = rating ;
		
		
	}
}

