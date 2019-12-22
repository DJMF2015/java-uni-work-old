import java.io.*;

public class MethodOne {

	public static void main(String[] args) {
	;

		mySum(200, 222, 444);
		mySum(333, 5436, 567);
		int var1 = addOne(292, 666);
		System.out.println(var1);
	}

	public static void mySum(int a, int b, int c)

	{
		System.out.println(a + b + c);
	}

	public static int addOne(int d, int e) {

		int x = d + e;
		return (x);

	}
}
