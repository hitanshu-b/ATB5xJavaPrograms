package src.multithreading.generics;

public class TClass {
	public static void main(String[] args) {
		
		Test<Integer> i = new Test<Integer>(5);
		System.out.println(i.getObject());
	}
	

}

class Test<T>{
	T obj;
	
	Test(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}