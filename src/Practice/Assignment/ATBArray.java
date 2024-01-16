package src.Practice.Assignment;

import java.util.Scanner;

public class ATBArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int atb_size=0;
		if(sc.hasNextInt()) {
			atb_size = sc.nextInt();
		}
		
		ATBClass[] ATB = new ATBClass[atb_size];
		System.out.println(ATB.length);
		System.out.println("Enter Details in Array: ");
		for(int i=0; i<ATB.length; i++) {
			if(sc.hasNextInt()) {
				ATB[i] = new ATBClass(sc.next(), sc.nextInt(), sc.next(), sc.nextLong(), sc.next());
			}
		}
		
//		ATBClass[] ATB = new ATBClass[1];
//		ATB[0] = new ATBClass("h",23,"abc@gmail.com",232453545,"atb5x"); 
//		
		System.out.println(ATB.length);
		System.out.println("ATB Details are as follows: ");
		for (int i = 0; i < ATB.length; i++) {
            System.out.println(ATB[i]);
        }
		sc.close();
	}

}
