package Rate1;

import Quantity.Rate;

public class QuantityTwo {
static int a = 900; static int b = 120; static int c =0;
	public static void main(String[] args) {
		//initilaizing the String variable with a value
	     // String name = "UKBatch";
	      //creating an instance of class MyClass in the package
	      Rate obj = new Rate();
	     System.out.println(obj.getQuantity(a , b ,c));
		}

}

/*import priceone.oneprice;
*import qtyone.qtyprice
 *
 * int q = 9000; int r = 120;
 *
 * oneqty obj1 = new oneqty();
 * oneprice obj2 = new oneprice();
 * System.out.println("value of the tiem:" + obj1.getqty(q));
 * System.out.println("value of the tiem: rater" + obj1.getprice(q));
 * System.out.println(obj1.getqty(q)) * obj2.getprice(q));
 * 
 * 
 * 
 ************

package qtyone;
public class oneqty{
public int qty(int qty)
{
return qty;
}
}
****************
*package priceone;
public class oneprice{
public int getPrice(int rate)
{
return rate;
}
}
Exercise: 
create a package with transaction by adding the original OpenBal + deposit - withdrawals
//calculate the closing balance in the main package
*/