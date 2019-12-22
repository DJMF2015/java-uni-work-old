//class object Person 
public class Persons {
	private String name;
	private int wt;
	//constructor with parameters
	public Persons (String name, int wt)
	{
		this.name=name;
		this.wt=wt;
	}
	//class - a blueprint for the objects that are created
	// object -  is an instance (copy) of the object created by the class
	public void printOne()
	{
		System.out.println("name of person is "+name);//print actual aprameters passed by value from class Closing BAlance
		System.out.println("name of person is "+wt);
	}
}