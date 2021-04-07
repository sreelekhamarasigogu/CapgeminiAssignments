package practise;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int num=sc.nextInt();
		for(int index=0;index<num;index++) {
			for(int j =0;j<=index;j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	}

}