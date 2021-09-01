package employe;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class Writeop {
  
public static void writer() throws IOException
{
	
	FileWriter wr=new FileWriter("C:\\Program Files (x86)\\Black_Box\\test.txt");
	
	BufferedWriter buf=new BufferedWriter(wr);
	
	buf.write("dhinu");
	buf.write("name");
	buf.write("good");
	
   buf.close();	
}

public static void main(String [] args)
{
	try{
	writer();
	}
	catch(IOException e)
	{
		System.out.println("writer method is handled");
	}
	
}



}

