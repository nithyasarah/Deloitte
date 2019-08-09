
abstract class Vehicle
{
	public abstract void start();
	
}

class car extends Vehicle
{
	
	@Override
	public void start() {
		System.out.println("Car started");
	}
	
	
	
	
}

class Bike extends Vehicle

{
	
	@Override
	public void start() {
		System.out.println("Bike started");
	}
	
	
}





public class Abs {
public static void main(String[] args) 
{
	car c= new car();
	c.start();
}
}
