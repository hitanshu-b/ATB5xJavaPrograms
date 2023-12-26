package src.basics_03;

public class Lab029 {
    public static void main(String[] args) {
        String s1 = "Hitanshu";
        //string constant pool or String pool

        // new operator : Basically it creates an object
        String s2 = new String("Hitanshu");
        // new operator is used to create new object for a class
        // it returns the address of newly created object
        System.out.println(s2);
        System.out.println(new String("Hitanshu"));

    }
}
