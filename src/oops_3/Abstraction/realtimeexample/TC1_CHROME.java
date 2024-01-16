package src.oops_3.Abstraction.realtimeexample;

public class TC1_CHROME extends BaseClass {

	@Override
	String openBrowser() {
		System.out.println("Starting CHROME");
		return null;
	}

	@Override
	String closeBrowser() {
		System.out.println("Closing CHROME");
		return null;
	}

}
