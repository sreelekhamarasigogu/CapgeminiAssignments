package practise;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date:");
		int date=sc.nextInt();
		//String suffix="";
		if((date>=1 && date <=10) || (date>=21 && date<=31)) {
			switch(date%10) {
			case 1:
				System.out.println("Date with suffix is: "+ Integer.toString(date)+"st");
				break;
			case 2:
				System.out.println("Date with suffix is: "+ Integer.toString(date)+"nd");
				break;
			case 3:
				System.out.println("Date with suffix is: "+Integer.toString(date)+"rd");
				break;
			default:
				System.out.println("Date with suffix is: "+Integer.toString(date)+"th");
			}
		}
		else if(date>=11 && date<=20)
			System.out.println("Date with suffix is: "+Integer.toString(date)+"th");
		else
			System.out.println("Wrong Date");

	}

}
