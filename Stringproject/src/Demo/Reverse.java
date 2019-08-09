package Demo;

import java.util.StringTokenizer;

public class Reverse {

	public static void main(String[] args) {
		
		String quote=" i:am:nithya:and:i:am:engineer";
		StringTokenizer token= new StringTokenizer(quote,":");
		int a;
		a=token.countTokens();		
		
		String arr[]=new String[a];
		
		int i=0;
		while(token.hasMoreTokens())
		{
			
		arr[i]=token.nextToken();
		++i;
		
		}	
		for(int j=a-1; j>-1;j--)
			
			System.out.println(arr[j]);
		
		
		
		
	}
	
	
}
