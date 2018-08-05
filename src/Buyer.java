
public class Buyer extends User{
	public String product;
	public int quantity;
	public int memberSinceYear;
	public int memberSinceMonth;
	
	

	public Buyer(String user, String password, String name, String surname, 
			String product, int quantity, int memberSinceYear, int memberSinceMonth) {
		
		super(user, password, name, surname);
		this.product=product;
		this.quantity=quantity;
		this.memberSinceYear=memberSinceYear;
		this.memberSinceMonth=memberSinceMonth;
	}

}
