package src.basics_03;

public class Lab018 {
    public static void main(String[] args){
        int a = 10;
        int b = 45;
        System.out.println(a+b);
        String name = "Ramesh";
        System.out.println(a+name);
        System.out.println(name+a);
        // Interview Question here
        // We go left to right while calculating
        // Concatenation only happens when we have string + Other
        System.out.println(a+b+name);

        // All the + below are acting as Concatenation
        System.out.println(name+a+b);
    }
}
