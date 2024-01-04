package src.Practice;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		leapYearCheck(year);
//        System.out.println("Enter the year: ");
//        int year= sc.nextInt();
//        if(((year%4==0)&&(year%100!=0))||((year%100==0)&&(year%400==0)))
//        {
//            System.out.println(year+" is leap year");
//        }
//        else
//        {
//            System.out.println(year+" is not leap year");
//        }
//
       sc.close();
	}
	public static void leapYearCheck(int year) {
		if((year % 400 == 0)||(year % 100 != 0) && (year % 4 == 0)) {
			System.out.println("It is a leap year");
		}else {
			System.out.println("It is not a leap year");
		}
	}
}
