
public class PurchaseOrder {
int orderno; String orderitem; int orderqty;
	

	//constructor
	PurchaseOrder(int orderno, String orderitem, int orderqty){//constructor
	this.orderno=orderno;
	this.orderitem=orderitem;
	this.orderqty=orderqty;
	//method call
	order(orderno, orderitem, orderqty);//method call 
}
	public static int order(int a, String b, int c){	//mthod 
		int total = a * c;
		System.out.println(""+total);
	
		return total;
		
	}
}
