import java.util.*;
import java.io.*;
public class Days {
	private static Scanner input;

	public static void main(String[] args) {
	int day; int month ; 	int year;
		System.out.println("input no of Days travel ");
		System.out.println("...and no of months travel.");
		
	
		try {
			Scanner input = new Scanner(System.in);
			day = input.nextInt();
			month = input.nextInt();
		   day = day/30 ;
		
		   year =month/12;
		
			
			System.out.println("Months:\n" + day +"\n Year(s):\n"+year);
		} catch (Exception e) {
			System.out.println("Numbers only, please! " );

		}

	}

}
