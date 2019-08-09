
public class exception 
{
	int i=0;
	Scanner sc= new Scanner (System.in);
	public void display()
	{
		try {
			i=10/0;
		} catch (Exception e) {
			System.out.println("error"+i);
		}
	}
public static void main(String[] args) {
	exception e= new exception();
	e.display();
}



	
	
	
	
	
}
