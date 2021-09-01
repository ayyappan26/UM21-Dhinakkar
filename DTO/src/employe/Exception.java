package employe;
import java.io.IOException;
public class Exception {

	public static void main(String [] args)throws IOException
	{
	 methodcall();
	 method1();
	 try{
	 method4();
	}
	 catch(IOException ex)
	 {
		System.out.print("IO is handled");
	 }
	 catch(Throwable p)
	 {
		 System.out.println("======");
	 }
	}
	static int a=10,b=0;
	
	public static void methodcall()
	{
		try
		{
		method1();
		}
		catch(RuntimeException g)
		{
		 System.out.println("handled");
		}
		catch(Throwable j)
		{
			System.out.println("sda");
		}
	}
	
	
	public static void method4()throws IOException
	{
		throw new IOException("sad");
	   // System.out.println("ioexception");//unreachable code
	}
	
	
	public static void method1()
	{
		 method3();
	  
		 
	    
	}
	
	 public static void method3()
	 {
		 
//	 
//	try{
//		  int c=a/b;     // throw new ArithmeticException();
//	  }
//	catch(RuntimeException e)
//	 {
//		System.out.println("cannot");
//	 }
	
	try
	{
		String l=null;
	   System.out.println(l.concat("sad"));
	try
	{
		int arr[]=new int[10]; 
	   System.out.println(arr[12]);
	try
	{
		String a="dhinu";
		int res=Integer.parseInt(a);
	
	}
	catch(NumberFormatException p)
	{
		System.out.println("array size is limited");
	}
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("das");
	}
	}
	catch(NullPointerException  p)
	{
		System.out.println("array size is limited");
	} 
	finally
	{
		System.out.println("finally");
	}
	 
	 
	 
	 }

	
}













