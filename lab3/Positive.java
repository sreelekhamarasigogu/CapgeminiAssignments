package lab3;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		isPositive(str);
	}

	public static void isPositive(String str) {
		int flag=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>str.charAt(i+1))
				flag=0;
			else
				break;
		}
		if(flag==1)
			System.out.println("The string is positive");
		else
			System.out.println("The string is not positive");
		
	}

}
