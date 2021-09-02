package QUESTION2;

public class PaybackCard extends Card {
	
	int pointsEarned ;
	double totalAmount ;
	
	public Integer getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(Integer pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public PaybackCard(String holderName, String cardNumber, String expiryDate,int pointsEarned,double otalAmount)
	{
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount=totalAmount;
		}
	
	}

