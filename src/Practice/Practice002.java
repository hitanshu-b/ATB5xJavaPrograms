package src.Practice;

public class Practice002 {
    public static void main(String[] args){
        //operators
        int num1 = 10;
        short num2 = 235;
        double num3 = 23.3534d;
        long num4 = 2354243L;
        byte num5 = 37;
        float num6 = 232.3434f;

        //Addition
        System.out.println("Sum1: "+ (num1 + num2));
        System.out.println("Sum2: "+ (num3 + num4));
        System.out.println("Sum3: "+ (num1 + num5));
        System.out.println("Sum4: "+ (num6 + num4));

        //Subtraction
        System.out.println("Sub1: "+ (num3 + num4));
        System.out.println("Sub2: "+ (num3 - num5));

        //mod %
        System.out.println("Rem1: "+(num3 % num1));

        //multiplication
        System.out.println("Mul1: "+(num3 * num5));

        //division
        System.out.println("Div: "+(num2 / num5));
    }
}
