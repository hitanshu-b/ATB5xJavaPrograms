package src.Practice;

import java.util.Scanner;

public class StaticBlock {

//Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

//If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
//
//Input Format
//
//There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.
//
//Constraints
//
//Output Format
//
//If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
//
//Sample input 1
//
//1
//3
//Sample output 1
//
//3

	static int b,h;

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        if(b>0 && h>0){
            int area = b * h;
            System.out.println(area);    
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }
}
