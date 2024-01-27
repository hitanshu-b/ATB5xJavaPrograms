package src.Practice.Assignment.Inheritance.Multilevel;

public class SheikhMansour {
	
	String teamName;
	double netWorth;
	String managerName;
	
	public SheikhMansour() {
		// TODO Auto-generated constructor stub
	}
	
	SheikhMansour(String team_name, double net_worth, String manager_name){
		this.teamName = team_name;
		this.netWorth = net_worth;
		this.managerName = manager_name;
	}
	
	void printTeamDetails() {
		System.out.println("Team Details: " + teamName + "--" + netWorth + "--" + managerName );
	}
	
	

}
