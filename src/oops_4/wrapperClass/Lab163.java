package src.oops_4.wrapperClass;

public class Lab163 {
	
	public static void main(String[] args) {
		int a = 10;
		Integer a2 = Integer.valueOf(a);
		
		Character ch = 'a';
		
		//unboxing
		char a3 = ch;
		
		System.out.println(Integer.valueOf(55));
		System.out.println(Integer.MAX_VALUE);
		
		double d = 90.46;
		String s2 = String.valueOf(d);
		Double st = Double.valueOf(d);
		int a22 = st.intValue();
		System.out.println(a22);
	}

}
