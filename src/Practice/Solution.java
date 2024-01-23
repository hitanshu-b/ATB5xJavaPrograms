package src.Practice;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	
        MyCalculator myCalculator = new MyCalculator();
        while(sc.hasNextLong()){
            int n = sc.nextInt();
            int p = sc.nextInt();
            //System.out.println(power(n,p));
            try{
                long res = myCalculator.power(n,p);
                System.out.println(res);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}

class MyCalculator{
	long power(int n, int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative");
        }else if(n<0 && p<0) {
        	throw new Exception("n and p should not be negative");
        }
        else if(n==0 && p==0){
			throw new Exception("n and p should not be zero");
		}else{
			return (long)Math.pow(n,p);
		}
    }
}