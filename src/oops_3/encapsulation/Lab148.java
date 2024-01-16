package src.oops_3.encapsulation;

public class Lab148 {
	
	public static void main(String[] args) {
		vwoLoginFixed v = new vwoLoginFixed("admin", "admin");
		
		boolean check = v.isLoggedIn("admin","password");
		String u = v.getUsername();
		System.out.println(u);
		System.out.println(check);
	}
	

}

class vwoLoginFixed{
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	// Param Constructor
	public vwoLoginFixed(String u, String p) {
		this.username = u;
		this.password = p;
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