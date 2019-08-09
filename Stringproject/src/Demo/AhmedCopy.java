package Demo;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class AhmedCopy {
	    public static void main(String[] args) throws IOException 
	    {
	        if(args.length ==0)
	        {
	            System.out.println("Hello, BEEP BEEP . 2 name required");
	            System.exit(0);
	        }
	        else if( args.length == 1)
	        {
	            System.out.println("Hello, BEEP BEEP . 1 more file name required");
	            System.exit(0);
	        }
	        
	        File fileRead = new File(args[0]);
	        if(fileRead.exists())
	        {
	            System.out.println("File exists");
	            
	        }
	        else
	        {
	            System.out.println("Don't be smart write correct file name u beep beep beep");
	            System.exit(0);
	        }
	        FileReader reader = new FileReader(args[0]);
	        FileWriter writer = new FileWriter(args[1]);
	        
	        int i=0;
	        while((i = reader.read()) != -1)
	        {
	            writer.write((char)i);
	        }
	        
	        
	        reader.close();
	        writer.close();
	        
	        
	        System.out.println("Successfully copied !! Enjoy ");
	    }
	}
	
	
	
	

