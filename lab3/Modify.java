package lab3;

import java.util.Scanner;

public class Modify {

	public static void main(String[] args) {
		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("The Modified number is:"+modify_number(num));
	}

	public static int modify_number(int num) {
		String str=Integer.toString(num);
		String s="";
		for(int i=0;i<str.length();i++) {
			if(i<=str.length()-2) {
				char c1=str.charAt(i);
				char c2=str.charAt(i+1);
				int j=(Character.getNumericValue(c1)-Character.getNumericValue(c2));
				s+=Math.abs(j);
				
			}
			else
				s+=Character.getNumericValue(str.charAt(i));
		}
		int i=Integer.parseInt(s);
		return i;
	}

}
