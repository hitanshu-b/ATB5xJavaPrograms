package src.oops_3;

public class IV1 {
	public static void main(String[] args) {

        Person h=new Person();
        System.out.println(h.a); // it will take the value of default constructor

        Person h2=new Person(23);
        System.out.println(h2.a);




        Person h3=new Person(23,true);
//        System.out.println(h3.a);
//        System.out.println(h3.b);
        System.out.println(h.b); // it will give default value i.e.=> False
        // as we haven't assigned any value to it
            h.a=99;
        System.out.println(h.a);









    }
}


class Person {
    int a;
    boolean b;

    // Default
    Person(){
        this.a = 10;
    }

    // Parameter Constructor
    Person(int b){
        this.a = b; //  h2.a
    }

    Person(int b,boolean a){
        this.a = b;
        this.b = a;
    }
}

