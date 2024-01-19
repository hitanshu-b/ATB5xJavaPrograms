package src.oops_4.Exceptions;

public class Lab166 {
	public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
        }
        

    }

}
