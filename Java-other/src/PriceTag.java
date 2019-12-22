import java.util.Arrays;
import java.util.Scanner;


public class PriceTag {
	static int a ;
	static int b ;
 // s1 = 0;
	public static void main(String[] args) {
		int value = myDisplay(a,  b);
		System.out.println("the value of the item $\t"+value);
    String y;
		int[][] table = new int[10][10];
		for (int row=0;row<10;row++) {
		
			for (int col=0;col<10;col++) {
				 System.out.println(col); 
				table[row][col] = 0;
				//System.out.println("*");
			
			}
		}
	}
		

	public static int myDisplay(int a, int b){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the quantity\t");
		int x = s1.nextInt();
		System.out.println("Enter the price\t");
		int c = s1.nextInt();
		return add(x, c);
	}
	
		public static int add(int a, int b){
		int x = a; int c = b;
		{
			int d = x * c;
		
		return (d);
		
		
	}
		
}
}