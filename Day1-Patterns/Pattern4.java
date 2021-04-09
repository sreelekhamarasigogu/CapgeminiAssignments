package practise;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
	    int k = 0;
	    for (int i=1;i<=rows;++i,k = 0) {
	      for (int j=1;j<=rows-i;++j) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	}

}
