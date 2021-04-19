package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Sum {

	public static void main(String[] args) {
		int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers:");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            int n = Integer.parseInt(temp);
            System.out.println(n);
            result = result + n;
        }
        System.out.println("sum of the integers is: " + result);
        sc.close();

	}

}
