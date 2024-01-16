package src.oops_3.encapsulation;

public class BadExample {
	public static void main(String[] args) {
		vwoLogin v = new vwoLogin("admin", "admin");
		
		boolean check = v.isLoggedIn("admin","password");
		//v.password = "password";
		boolean check2 = v.isLoggedIn("admin","password");
		System.out.println(check2);
	}
	
}

class vwoLogin{
	
	// make variables private in nature
	
	private String username;
	
	private	 String password;
	
	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public vwoLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	boolean isLoggedIn(String username, String password) {
		if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
			System.out.println("Logged IN");
			return true;
		}
		else {
			System.out.println("Login Failed");
			return false;
		}
	}
}
