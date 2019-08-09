package Demo;
import java.io.File;
import java.io.IOException;
public class FileCreation {

	

	 public static void main(String[] args) throws IOException
	 
	 
	 {
		
		
		File f1=new File("C:\\deloitte\\Batch"); 
		File f=new File("C:\\deloitte\\Batch\\BatchMates.txt");
		File f2=new File("C:\\deloitte\\Batch\\xyz");
		f.createNewFile();
		
		if(f1.exists())
		{
			if(f.exists())
			f.listFiles();
			else
				if(f2.exists())
			f2.list();
		System.out.println("It is a file:"+ f);
		System.out.println("It is a folder:"+f2);
		}
		 
		 
}
}