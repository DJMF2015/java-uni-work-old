
public class Return {

	public static void main(String[] args) {
		add1(2,2);
		
		add2(2,4);
		System.out.println(add2(2,4));
	}
     static void add1(int num1, int num2){
    	 System.out.println(num1 + num2);
     }
     static int add2(int num1,int num2){
    	 
    	 return num1 + num2;
     }
}
