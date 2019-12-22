import java.util.ArrayList;
import java.util.Iterator;


public class CreatePurchase {

	public static void main(String[] args) {
		  PurchaseOrder s1 = new PurchaseOrder(1041, "dPI99I", 5);
		  PurchaseOrder s2 = new PurchaseOrder(10, "XXII86B", 5);
		  PurchaseOrder s3 = new PurchaseOrder(1303, "OIAH79D", 10);
	
		//creating arraylist
		ArrayList<PurchaseOrder> arr = new ArrayList<PurchaseOrder>();
	 arr.add(s1); arr.add(s2);arr.add(s3);
	//getting Iterator
	Iterator<PurchaseOrder> itr=arr.iterator();
	 //traversing elements of ArrayList object
	// while(itr.hasNext()){
		PurchaseOrder st=(PurchaseOrder)itr.next();
		System.out.println(st.orderno+" "+st.orderitem+" "+st.orderqty);
	}
	}
//}
