import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.awt.*;

import javax.swing.JPanel;


public class ArrayTwo {

	public static void main(String[] args) {
		String item[] = new String[4];
		
		item[0] = "mobiles";item[2] = "laptop";
		item[1] = "phones";	item[3] = "iphone";
	
		String [] item2 ={"mobiles", "laptops", "tablets", "iphones\n"};
		//System.out.println("3rd element is: "+ item[2]);
		
		int size = item2.length;
	//	System.out.println("suize of array is :" + size);
		for (int i = 0;i<size;i++){
		//	System.out.println("Index[" + i+ "]="+ item2[i]);

		}//iteration provided by java 5 >
		//for (String str: item2){
			//System.out.println(str);
			
			ArrayList<String> mountain = new ArrayList<String>();
			
			mountain.add("ben nevis")
			;mountain.add("cairngorm");
			mountain.add("snowdon \n");
			
			ArrayList<String> mount = new ArrayList<String>();
			mount.add("Trump");
			mount.add("cameron");
			mount.add("Putin");
	//		Collections.shuffle(mountain);
			mountain.addAll(mount);

			Iterator itr=mountain.iterator();
			while (itr.hasNext()){
				Collections.shuffle(mountain);
				System.out.println(itr.next());
				
				
			}
			//for (String st: mountain){
			//	System.out.println("index is" + st);
			}
		//}
	}

//}
