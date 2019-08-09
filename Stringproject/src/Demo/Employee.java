package Demo;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		
		String quote=" i am nithya: and i am engineer";
		StringTokenizer token= new StringTokenizer(quote,":");
		
		while(token.hasMoreTokens())
		{StringBuffer name= new StringBuffer(token.nextToken());
		name.reverse();	
		System.out.println(name);
			
		}
		
		
		
		
	}
	
	
	
}
 