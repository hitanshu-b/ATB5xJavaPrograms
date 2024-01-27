package src.Practice.Assignment.Inheritance.Multilevel;

public class BlueCity extends CityGroup{
	
	String cityTeamName;
	String countryName;
	
	BlueCity(String city_team_name, String country_name){
		this.cityTeamName = city_team_name;
		this.countryName = country_name;
	}
	
	void printDetails() {
		System.out.println("Team Details: "+cityTeamName+ "-->" +countryName );
	}

}
