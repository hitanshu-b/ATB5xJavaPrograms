package src.oops_2.Inheritance;

public class Java extends Programming {
	
	String feature;
	
	Java(){
		System.out.println("Java DC");
	}
	
	Java(String newFeature){
		this.feature = newFeature;
	}
	
	void printInfo() {
		System.out.println("Feature: "+feature);
	}

}
