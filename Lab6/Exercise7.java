package lab6;
import java.util.*;
import java.util.Scanner;
public class Exercise7 {
	public static int[] getSecondSmallest(int[] a) {
		List<Integer> lst = new ArrayList<Integer>();
		for(int i = 0; i < a.length; i++) {
			String s = "" + a[i];
			StringBuilder sbr = new StringBuilder(s);
			String st = "" + sbr.reverse();
			lst.add(Integer.parseInt(st));
		}
		Collections.sort(lst);
		for(int i = 0; i < a.length; i++) {
			a[i] = lst.get(i);
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		getSecondSmallest(a);
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

}
