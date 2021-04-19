package lab3;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int characters=0,word=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
				characters++;
		}
		System.out.println("Number of lines are: "+characters);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				word++;
		}
		System.out.println("Number of words: "+word+1);
		
	}

}
