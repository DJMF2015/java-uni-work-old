import java.util.Scanner;

public class UnitOne {
	String name;
	static String a = " ";

	public static void main(String[] args) {
		
		do {

			System.out.println("value of input via scanner");
			Scanner s1 = new Scanner(System.in);
			//System.out.println("enter the value of variable");
			try{
			
			System.out.println("Enter your name, please");
			}
			catch (ArithmeticException String ) {
				System.out.println("Exception thrown artightmetic errro  :" + String); 
			}
			String name = s1.nextLine();
			if (name.equals("david")) {
				System.out.println("Description of itemcode\t" + name);
			} else {
				System.out.println("name is invalid' sorry");
			}
			System.out.println("Continue: Y/N? \t" + name);
			a = s1.next();
		} while (a.equals("y"));
		// TestThree two = new TestThree();
		// two.displayadd();
		// System.out.println("value of the variable \t"+ n4);

		if (a.equals("n") || (a.equals("N")));
			
		System.out.println("Goodbye!");
	}

}
