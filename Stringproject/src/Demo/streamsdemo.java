package Demo;
import java.io.File;
import java.io.FileWriter;
public class streamsdemo {

	
	public static void main(String[] args) {
		
		FileWriter w= new FileWriter("C:\\deloitte\\Batch\\BatchMates.txt");
		w.write("hello");
	w.close();
		/*FileReader f=new FileReader("C:\\\\deloitte\\\\Batch\\\\BatchMates.txt")
		while(i=f.read()!=-1)
			System.out.println(char(i));
		f.close();
		*/
		
		
	}
	
}
