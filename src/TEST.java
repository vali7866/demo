import java.io.File;
import java.io.FileReader;

public class TEST {
	
	public static void main(String[] args) {
		
		
		try
		{
			
			File f=new File("D:\\ACCOUNT DETAILS.txt");
			FileReader r=new FileReader(f);
			
			for (int i=0;i<f.length();i++)
			{
				System.out.print((char) r.read());
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
