package testing;


 abstract class Person1
{
	final String b="dhinu";
	public abstract void helmetcam();   
    
   public abstract void nitrous();

   public abstract void guns(); 

   public abstract void bigtires();
   
   public abstract void gearbox();
   
   public abstract  void flying();
   
   public void dis() {
	   System.out.println("person1 doesnot know helmet");
	   System.out.println("person1 doesnot know nitrous");
	   System.out.println("person1 doesnot know  guns");
	   System.out.println("person1 doesnot know  bigtires");
	   System.out.println("person1 doesnot know gearbox");
	   System.out.println("person1 doesnot know  flying");

	   
	   
   }

}
	
abstract class Person2 extends Person1 
{
	
public void helmetcam()
{
	
	
	System.out.println("person2 created helmet cam is fitted");
}
}
abstract class Person3 extends Person1
{
	
	public void guns()
{
    System.out.println("person3 tells guns is ready for firing");		
		
		
	}
   public void  bigtires()
   {
	   System.out.println("person3 fiitted exodus");
	  System.out.println("final variable cannot be changed"+b);   
   }
  
  public abstract  void flying();
  
}
abstract class Person4 extends Person3

{
	
	
	
	public final void nitrous()
	{
		System.out.println("person 4 tells nitrous is implemented");
		
		
		
	}
	public void helmetcam()
	{
		System.out.println("person4 has helmetcam");
	}
	
	public void flying()
	 {
		 
		System.out.println("perosn4 tells bike is ready for flying");
	 }
	
}
class Person5 extends Person4
{
	public void gearbox()
	{
		System.out.println("person5 tells gear box is getting ready");
	}

	
	}
	



public class Abstract  
{
 
	
public static  void main(String[] args)
{
	Person1 oj=new Person5();
	 System.out.println("abstract of modifying a bike");
    oj.dis();
	oj.bigtires();
    oj.flying();
    oj.guns();
    oj.nitrous();
    oj.helmetcam();
    oj.gearbox();


}

}
