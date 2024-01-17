package src.oops_3.Interface;

public class Son implements FatherI{

	@Override
	public void loan1k() {
		FatherI.print2();
		System.out.println("Will give the loan");
	}

}
