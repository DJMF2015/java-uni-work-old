import java.util.Scanner;


public class Conversion {

	
	static String a = " ";

	public static void main(String[] args) {
		do {
		
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the value please in dollars-1, rupees - 2, pounds - 3, zar - 4");
			int option = s1.nextInt();
			switch(option)
			{
			case 1 :
		       System.out.println("Dollars belongs to US");
		       break;
			case 2:
				System.out.println("Rupees belongs to India");
				break;
			case 3:
				System.out.println("Pounds belongs to UK");
				break;
			case 4:
				System.out.println("Zar eblongs to china/africa");
				break;
			}
		//	int add;int multiply;
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter the value please ");
			int vol = s2.nextInt();
			switch(vol)
			{
		case 6 :
		       vol = vol *119;
		       
			
				System.out.println("Pounds to Rupees is: " + vol);
				break;
			};
		
			
			
			//System.out.println("Enter your name, please");
		//	String name = s1.nextLine();
		//	if (name.equals("david")) {
		//		System.out.println("Description of itemcode\t" + name);
		//	} else {
			//	System.out.println("name is invalid' sorry");
		//	}
		//	System.out.println("Continue: Y/N? \t" + name);
			a = s1.next();
		} while (a.equals("y"));
		// TestThree two = new TestThree();
		// two.displayadd();
		// System.out.println("value of the variable \t"+ n4);

		if (a.equals("n") || (a.equals("N")));
			
		System.out.println("Goodbye!");
	}

}
