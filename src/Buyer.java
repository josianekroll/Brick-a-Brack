
public class Buyer extends User{
	public String product;
	public int quantity;
	public int reputationStatus;
	public int memberSinceYear;
	public int memberSinceMonth;
	public Bid [] bids;
	
	

	public Buyer(String userName, String password, String firstName, String surname, String email, String userLocation, int area, 
			String product, int quantity, int memberSinceYear, int memberSinceMonth) {
		
		super(userName, password, firstName, surname, email, userLocation, area);
		this.product=product;
		this.quantity=quantity;
		this.memberSinceYear=memberSinceYear;
		this.memberSinceMonth=memberSinceMonth;
	}
	
	
	public int rateSeller(String name) {
		return reputationStatus;
		
	}
	
	public String getNotification(String product) {
		// if product in the category, return product
		
		return product;
		
	}

}
