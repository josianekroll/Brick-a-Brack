
public class Seller extends User {
	public Product [] products;
	public int quantity;
	public int memberSinceYear;
	public int memberSinceMonth;
	

	public Seller(String userName, String password, String firstName, String surname, String userLocation, int area, 
			Product[] products, int quantity, int memberSinceYear, int memberSinceMonth) {
		
		super(userName, password, firstName, surname, userLocation, area);
		this.products=products;
		this.quantity=quantity;
		this.memberSinceYear=memberSinceYear;
		this.memberSinceMonth=memberSinceMonth;
	
	}

}
