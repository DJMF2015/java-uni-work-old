package MyPackageTwo;

import MyPackage.MyClass;

public class PrintName {

	public static void main(String[] args) {
	//initilaizing the String variable with a value
      String name = "UKBatch";
      //creating an instance of class MyClass in the package
      MyClass obj = new MyClass();
      obj.getNames(name);
	}
//create one package with qty and another with rate
	//call both the packages in the main package to calculate the value
}
                                                        