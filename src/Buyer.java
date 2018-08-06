
public class Buyer extends User{
	public String product;
	public int quantity;
	public int memberSinceYear;
	public int memberSinceMonth;
	public Bid [] bids;
	
	

	public Buyer(String userName, String password, String firstName, String surname, String userLocation, int area, 
			String product, int quantity, int memberSinceYear, int memberSinceMonth) {
		
		super(userName, password, firstName, surname, userLocation, area);
		this.product=product;
		this.quantity=quantity;
		this.memberSinceYear=memberSinceYear;
		this.memberSinceMonth=memberSinceMonth;
	}

}
