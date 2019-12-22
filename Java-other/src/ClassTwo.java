import java.util.*;
import java.io.*;
import java.io.ObjectInputStream.GetField;
public class ClassTwo {
/*	static int result;
	public static void main(String[] args) {
		int a; int b ; 
		try{
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		result = a*b;
		
		System.out.println("input two integers");
		
		}catch( Exception e){
			System.out.println("Only input two integers! " + e);	
		
		}
		System.out.println("Result" + result);
	
	}

}
*/
	/*
//divide by zero exception example
	public static void main(String[] args) {
		int a; int b ; 	int result; Scanner input = new Scanner(System.in);
		System.out.println("input two integers, please");
		a = input.nextInt();		b = input.nextInt();
		try{
			result = a/b;
		
			System.out.println("Result " + result);
		
		}
		catch (ArithmeticException e) 
		{System.out.println("exception caught division by zero");
	}
	}
	*/
	public static void main(String[] args) {
		int a; int b ; 
	try{
		long data[] = new long[100000000];
	}
	catch (Exception e)
	{System.out.println(e);
	}
	finally {System.out.println("finally block will always throw exception!" );
	}
	}
}