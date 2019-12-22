import java.util.ArrayList;
import java.util.Iterator;


public class TwoEmp {
	
public static void main(String[] args){
	OneEmp s1 = new OneEmp(101, "david", 23);
	OneEmp s2 = new OneEmp(102, "james", 24);
	OneEmp s3 = new OneEmp(103, "Jonah", 26);
//creating arraylist
	ArrayList<OneEmp> arr = new ArrayList<OneEmp>();
arr.add(s1); arr.add(s2);arr.add(s3);
//getting Iterator
Iterator<OneEmp> itr=arr.iterator();
//traversing elemnts in list object
while(itr.hasNext()){
	OneEmp st=(OneEmp)itr.next();
	System.out.println(st.empno+" "+st.empname+" "+st.age);
	
	
	}  
	} 
{
}
}
