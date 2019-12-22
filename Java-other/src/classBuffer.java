import java.io.*;
import java.lang.*;
/*
public class classBuffer {


	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("UKBatch\t");
		sb.append("Testing java");
		System.out.println(sb);

example2 a = new example2();
	}

}
*/
 class classBuffer{
   public static void main(String[] args){
	 //  example2 t = new example2();

   StringBuilder sb = new StringBuilder("Hello");
   sb.insert(1, "java"); //now original changed
   
   System.out.println(sb);
   }
 }
 