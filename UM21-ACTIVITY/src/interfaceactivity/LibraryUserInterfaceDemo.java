package interfaceactivity;

interface LibraryUser {
  
	  void  registerAccount(int  kidage);
	  void  requestBook(String book);
	  
}
class KidUser implements LibraryUser
{
	
	int age;
	String bookType;
	
	public void registerAccount(int a)
	{
		this.age=a;
       
		if(this.age<12)
		{
			System.out.println("you have successfully registered under a kids account");
		}
		else
		{
			
			System.out.println(" Sorry age must be less than 12 to register as a kid");
		}
	}
	public void requestBook(String b)
	{ 
		this.bookType=b;
		
		if(bookType.equals("kids"))
		{
			System.out.println("Book issued succcessfully please return the book within 10 days");
		}
		else
		{
			System.out.println("oops you are allowed to take only kids books");
		}
	}
	
	
	
}
class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	
	public void registerAccount(int kidage)
	{ 
		this.age=kidage;
		if(age>12)
		{
			System.out.println("you have successfully registered under a Adult account");
		}
		else
		{
			
			System.out.println(" Sorry age must be greater than 12 to register as a Adult");
		}
	}
	public void requestBook(String book)
	{
		this.bookType=book;
		if(bookType.equals("Fiction"))
		{
			System.out.println("Book issued succcessfully please return the book within 7 days");
		}
		else
		{
			System.out.println("oops you are allowed to take only Adult fiction books");
		}
	}
}
	
	
public class LibraryUserInterfaceDemo
{
	public static void main(String [] args)
	{
		KidUser kid1=new KidUser();
		KidUser kid2=kid1;
		System.out.println("=======kid1 details==== ");
		kid1.registerAccount(10);
        kid1.requestBook("kids");
		System.out.println("=====kid2 details====");
		kid2.registerAccount(18);
 	    kid2.requestBook("Fiction");
		AdultUser adult1=new AdultUser();
 	    AdultUser  adult2=adult1;
 	    System.out.println("======Adult1 deatils========");
 	    adult1.registerAccount(5);
	    adult1.requestBook("kids");
 	    System.out.println("======Adult2 deatils======");
	    adult2.registerAccount(23);
	    adult2.requestBook("Fiction");
	   
	
	}
	
	
	
}