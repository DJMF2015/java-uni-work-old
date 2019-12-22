import java.util.Scanner;
public class OneEmp {
	
	int empno; String empname; int age;
	

	
	OneEmp(int empno, String empname, int age){
		this.empno = empno;
		this.empname=empname;
		this.age=age;
}
}
/**

public class  emp{
	public static void main(String [] args){
		//int a=20;
		//Integer i=Integer.valueOf(a);                                                                                                           
		Integer a=new Integer(3);
		int i =a.intValue();//converting Integer to int
		Integer j=a;//unboxing, now compiler will write a.intValue() internally
		System.out.println(a+" "+i+" "+j);
		int i2 = 90;    // Primitive data type 'int'  
	//  Integer Wrapper class instantiation        
	Integer i2_Obj = new Integer(i);        // Unwrapping primitive data 'int' from wrapper object        
	int i3 = i2_Obj.intValue();    System.out.println(i2 + i3);
	}
}
//float has three default constructors in form of wrapper classes. These are int/float/double/boolean/short/long
//eg) a primitive data type int has two constructors as an Integer and Valueof()
//float as three constructors float/string/double
//default constructor is available  in java.lang.comnpARE
	
	*/