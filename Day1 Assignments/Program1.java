package practise;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int english_marks=sc.nextInt();
		int java=sc.nextInt();
		int db=sc.nextInt();
		int springTools=sc.nextInt();
		float total=english_marks+java+db+springTools;
		System.out.println("Total Marks: "+total);
		System.out.println("Average: "+total/4);

	}

}
