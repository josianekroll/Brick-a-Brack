
public class Seller extends User {
	public Product [] products;
	public int quantity;
	public int memberSinceYear;
	public int memberSinceMonth;
	

	public Seller(String user, String password, String name, String surname, 
			Product[] products, int quantity, int memberSinceYear, int memberSinceMonth) {
		
		super(user, password, name, surname);
		this.products=products;
		this.quantity=quantity;
		this.memberSinceYear=memberSinceYear;
		this.memberSinceMonth=memberSinceMonth;
	
	}

}
