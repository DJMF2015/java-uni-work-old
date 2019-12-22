import java.io.*;
import java.util.Scanner;

public class TestFour {

	public static void main(String[] args) {
		System.out.println("value input via scanner in");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of variable, please");
		int out = s1.nextInt();
		TestThree two = new TestThree();
		two.displayadd();
		System.out.println("value of variable is " +out );
	}

}
