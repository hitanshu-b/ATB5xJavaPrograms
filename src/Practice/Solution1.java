package src.Practice;

import java.util.*;

public class Solution1 {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int output1 = checkException(x,y);
        System.out.println(output1);
        sc.close();
    }
    
    public static int checkException(int x,int y) throws Exception{
        if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE || y < Integer.MIN_VALUE || y > Integer.MAX_VALUE){
            throw new Exception("java.util.InputMismatchException");
        }
        else if(y == 0){
            throw new Exception("java.lang.ArithmeticException: / by zero");
        }
        else{
            return x / y;
        }
    }
}