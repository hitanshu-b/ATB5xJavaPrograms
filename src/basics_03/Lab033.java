package src.basics_03;

public class Lab033 {
    public static void main(String[] args) {
        String name = "Hitanshu";
        String name1 = "Hitanshu";
        String name2 = new String("Hitanshu");

        System.out.println(name == name1);
        System.out.println(name.equals(name2));

        System.out.println(name == name2);
        //different as one of them is in string pool and another is in object area

        System.out.println(name.equals(name2)); //true
        System.out.println(name.equalsIgnoreCase(name2)); //true
    }
}
