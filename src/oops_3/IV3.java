package src.oops_3;

public class IV3 {
	public static void main(String[] args) {
        P03 h=null;
        P03 h2=new P03();
       // System.out.println(h.a); // it will give null pointer exception 
        // as we have assigned object equals to null
        System.out.println(h2.a);
    }

}
class P03 {
    int a;

}
