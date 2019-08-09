
class vehicle{
	
	
	int model;
	

	public vehicle(String cart)
	{
		System.out.println("constructor 2"+cart);
	}
}

class car extends vehicle
{
	public car()
	{
	super("GG")	;
	System.out.println("hello ");
	}
	
	public car(String cart)
	{
		super(cart);
		System.out.println("bye");
	}
}


 public class app
{
	public static void main(String[] args) {
		
car c =new car("ford");
	}

}
