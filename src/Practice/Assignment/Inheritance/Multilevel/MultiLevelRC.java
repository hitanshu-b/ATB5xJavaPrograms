package src.Practice.Assignment.Inheritance.Multilevel;

public class MultiLevelRC {
	
	public static void main(String[] args) {
		
		SheikhMansour s = new SheikhMansour("Manchester City",12000000,"Gattusso");
		CityGroup c1 = new CityGroup("Manchsester City FC", 472000000);
		BlueCity b1 = new BlueCity("New York City FC", "America");
		
		s.printTeamDetails();
		c1.teamValuation();
		b1.printDetails();
	}

}
