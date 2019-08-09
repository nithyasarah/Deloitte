
abstract class Animal
{
	public abstract void noise();
	public abstract void roam();
	public abstract void eat();
	public  void sleep()
	{
		
		System.out.println("Animal sleeps");
	}
	
	
}

abstract class Feline extends Animal
{
public void roam()
{
System.out.println(" Everywhere");	
}

}

abstract class  Hippo extends Animal
{
	public void noise()
	{
	System.out.println("Sound B");	
	}
	public void eat()
	{
	System.out.println("Non veg");	
	}

}

	abstract class  Canine extends Animal
	{
		public void roam()
		{
		System.out.println("Somewhere");	
		}

	}
	
	class Lion extends Feline
	
	{public void noise()
	{
	System.out.println("Roars");	
	}
	public void eat()
	{
	System.out.println("Eats Deer");	
	}
	
		
	}
	
	class Cat extends Feline
	{
		public void noise()
		{
		System.out.println("Meow");	
		}
		public void eat()
		{
		System.out.println("Eats Fish");	
		}	
		
		
	}
	
	
	class Dog extends Canine
	{
		public void noise()
		{
		System.out.println("Dog Noise");	
		}
		public void eat()
		{
		System.out.println("Eats bone");	
		}	
		
		
	
	}


public class AnimalApp {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.eat();
		d.noise();
		d.roam();
		d.sleep();

	}

}
