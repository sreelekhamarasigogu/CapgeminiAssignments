package lab3;

import java.util.Scanner;

public class Mirror_image {

	public static void main(String[] args) {
		String str;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("The string:");
		str = sc.next();
		String res = getImage(str);
		System.out.println(res);

	}
	public static String getImage(String s) {
		String rev = new StringBuffer(s).reverse().toString();
		String ans = s+"|"+rev;
		return ans;



		}

}
