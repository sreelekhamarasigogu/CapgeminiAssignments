package practise;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row limit:");
		int row=sc.nextInt();
		int k =1;
		for(int i=0;i<row;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print(k++ +" ");
			}
		System.out.println();
		}

	}

}