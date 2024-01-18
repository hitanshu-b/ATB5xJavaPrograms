package src.oops_4.InnerClass;

public class Lab155 {
	public static void main(String[] args) {
		OOC n = new OOC();
		OOC.SNCI icref = new OOC.SNCI();	
		icref.show();
	}

}

class OOC{
	
	static int o = 199;
	
	int a = 299;
	
	static class SNCI{
		void show() {
			//System.out.println(a);
			System.out.println(o);
		}
	}
}
