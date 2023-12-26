package src.basics_03;

public class Lab027 {
    public static void main(String[] args) {
        //type casting -- Mold
        // Widening is a process of converting lower type to higher type
        byte b = 10;
        //int a = b; //Implicit typecasting - done by jvm
        int a = (int)b; //Explicit typecasting

        //Narrowing is a process of converting higher type to lower type
        int a1 = 300;
        //byte b1 = a1; //Invalid Implicit typecasting
        byte b1 = (byte)a1; // Explicit casting
    }
}
