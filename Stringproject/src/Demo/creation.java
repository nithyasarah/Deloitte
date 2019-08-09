package Demo;

import java.io.File;
import java.io.IOException;

public class creation {


	 public static void main(String[] args) throws IOException
	 
	 
	 {
		
		
		File f1=new File("C:\\deloitte\\Batch"); 
		File f=new File("C:\\deloitte\\Batch\\BatchMates.txt");
		File f2=new File("C:\\deloitte\\Batch\\xyz");
		
		
		if(f1.exists())
		{
			File allFiles[]=f1.listFiles();
			for(File temp:allFiles)
			{
				if(temp.isDirectory())
				{
					System.out.println(temp+" is Directory");
				}
				
				else
					System.out.println(temp+" is File");
				
	
			}
			
		}
		
		else
		{
			f1.mkdir();
			f2.mkdirs();
			f.createNewFile();
			System.out.println("file and folder created");
		}
			
		
		
		}
		 
	
	
	
}
