package employe;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {
  
	public static void exception() throws FileNotFoundException
	{
		
	
	File file=new File("C:\\Program Files (x86)\\Black_Box\\myfile.txt");
   
	
	try{
	BufferedReader buff=new BufferedReader (new FileReader(file)) ;
    
	String sh;
	
	while((sh=buff.readLine())!=null)
	{
		System.out.println(sh);
	}
   buff.close();	
}
	catch(FileNotFoundException er)
   {
	  System.out.println("file is not there in ur pc");
   }
  catch(IOException e)
	{
	  System.out.println("handled");
	}
	}
	public static void main(String [] args)throws FileNotFoundException
	{
	  exception();	
	}


}
