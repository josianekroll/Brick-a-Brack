
public abstract class User {
	public String userName;
	public String password;
	public String firstName;
	public String surname;
	public String email;
	public String userLocation;
	public int area;
	public static final int PASSWORD_LENGTH = 8;
	

	public User(String userName, String password, String firstName, String surname, String email, String userLocation, int area) {
		this.userName=userName;
		this.password=password;
		this.firstName =firstName;
		this.surname=surname;
		this.email=email;
		this.userLocation = userLocation;
		this.area=area;
		
	}
	
	public boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
    
	public final String isPasswordCorrect(String password)
	{
        if (is_Valid_Password(password)) {
            return "Password is valid ";
        } else {
            return "Not a valid password";
        }
	}
    
    
	

}
