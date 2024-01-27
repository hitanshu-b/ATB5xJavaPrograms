package src.Practice.Assignment.Inheritance.Multilevel;

public class CityGroup extends SheikhMansour{
	
	String name;
	double transferMoneySpent;
	
	public CityGroup() {
		
	}
	
	CityGroup(String name_of_team, double transfer_money_spent){
		this.name = name_of_team;
		this.transferMoneySpent = transfer_money_spent;
	}
	
	void teamValuation() {
		System.out.println("Money Spent on Transfers: " + name + "-->" + transferMoneySpent);
	}
	
	

}
