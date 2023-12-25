package src.basics_02;

public class Lab008 {
    public static void main(String[] args) {
//        int number = 23;
//        System.out.printf("%d * 1 = %d * 1", number,2);
        //only for formatting purpose

        String name = "Hitanshu";
        System.out.println("Your name is "+ name);

        // Formatting
        System.out.printf("Your name is %s",name);

        System.out.println();
        // %d --> any integer, short, byte, long
        // %c -> char
        // %s -> string
        // %f -> float

        float pi = 3.14232323f;
        System.out.printf("Your value is %f",pi);
    }
}
