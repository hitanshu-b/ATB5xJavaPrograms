package src.Practice.Assignment;

import java.util.Scanner;

public class ATBArray {
	
	private int rollNo[];
	private String name[];
	private long phoneNo[];
	
	public int[] getRollNo() {
		return rollNo;
	}

	public void setRollNo(int[] rollNo) {
		this.rollNo = rollNo;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public long[] getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	public void arrayInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] rollNo = new int[size];
		String[] name = new String[size];
		long[] phoneNo = new long[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the details " + (i+1) + "st Student: ");
			rollNo[i] = sc.nextInt();
			name[i] = sc.next();
			phoneNo[i] = sc.nextLong();
		}
		setRollNo(rollNo);
		setName(name);
		setPhoneNo(phoneNo);
		sc.close();
	}
	
	public void arrayDetails() {
		for(int i=0; i<rollNo.length; i++) {
			System.out.println("["+ getRollNo()[i] + "--" + getName()[i] + "--" + getPhoneNo()[i]+ "]");
		}
	}
	
}


