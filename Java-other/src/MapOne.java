import java.util.*;
import java.util.ArrayList;
import java.util.HashMap; import java.util.List; import java.util.Map;

public class MapOne {

	public static void main(String[] args) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		//create list one and store values
		List<String> valSetOne = new ArrayList<String>();
		valSetOne.add("USA");
		valSetOne.add("dollar");
		List<String> valSetTwo = new ArrayList<String>();
		valSetTwo.add("UK");
		valSetTwo.add("Pound Sterling");
		//create three lists and store values
		List<String> valSetThree= new ArrayList<String>();
		valSetThree.add("India");
		valSetThree.add("RupeesCar");
		//put values into hashmap
		map.put("U =>", valSetOne);
		map.put("S =>", valSetTwo);
		map.put("I = >", valSetThree);
		//Iterate and display values
		System.out.println("Fetching Keys and corresponding [multiple] values + n");
		for (Map.Entry<String, List<String>> entry: map.entrySet()){
			String key = entry.getKey(); List<String> values = entry.getValue();
			System.out.println("key = " + key);
			System.out.println("Values = " + values + "n");
		}
	}
}
