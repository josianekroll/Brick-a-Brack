
public abstract class User {
	public String user;
	public String password;
	public String name;
	public String surname;
	public static final int PASSWORD_LENGTH = 8;
	

	public User(String user, String password, String name, String surname) {
		this.user=user;
		this.password=password;
		this.name =name;
		this.surname=surname;
		
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
