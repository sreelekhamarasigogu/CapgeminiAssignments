package lab3;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date: ");
		String str=sc.next();
		date(str);

	}

	private static void date(String str) {
		String date[]=str.split("-");
		String day=date[0];
		String month=date[1];
		String year=date[2];
		System.out.println("Day: "+day);
		System.out.println("Month: "+month);
		System.out.println("Year: "+year);
		
	}

}
