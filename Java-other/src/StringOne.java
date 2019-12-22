import java.io.*;
public class StringOne {
//	String i = "I love Java"; 
	public static void main(String[] args) {
		String mystring="hello there";
		int strlength = mystring.length();
		System.out.println("length of string is "+ strlength);
		String repstr ="UK batch are doing great";
		String s2=repstr.replaceAll(repstr, " replace me");//replaceAll
		System.out.println("replace string" + s2);
		System.out.println("Location of string is at " + (mystring.indexOf('o')));//indexOf
		repstr.replace('a','e');//replace
		System.out.println("Location of string is at " + repstr);
		
	}
	

}
