package lab3;

import java.util.Scanner;

public class Replace_consonants {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s=sc.next();
		System.out.println("The string is: "+replace_consonants(s));

	}

	public static String replace_consonants(String s) {
		String result="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
				result+=c;
			else if(c=='Z'||c=='z')
				result+=c;
			else {
				int j=c;
				j+=1;
				result+=(char)j;
			}
		}
		return result;
	}

}
