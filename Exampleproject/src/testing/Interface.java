package testing;


interface Appidea {

	 final int a=89;
	
	public  void app(); //default abstract methods  
   
	public void appview();
                                             //only abstrct methods no method body
	public void appdata();
	                                         //only static final variables
	public void  graphic();
	
	
}
interface Mobidea extends Appidea
{
   int 	 a=50; //default static final
   
   	public void blueprint();


}

class Helper implements Mobidea 
{
	
	public void app() {
		System.out.println("app bluprint");
	   	
	}
	
	public void var()
	{
		System.out.println("final var"+a);
	}
	public void appview()
	{
		
		System.out.println("desining app view");
		
	}
	public void appdata()
	{
		
		System.out.print("implementing app data");
		
	}
	public void graphic()
	{
		
		System.out.println("implemting graphical interface");
	}
	public void blueprint()
	{
		System.out.println("blueprint of helper");
	}
	
	
	
}
class Helper1 extends  Helper
{
	public void app() {
		System.out.println("overiden app bluprint ");
		
	}
	public void appview()
	{
		
		System.out.println( " overrriden desining app view");
		
	}
	public void var()
	{
		System.out.println("final var"+a);
	} 	
}
class Helper2 implements Mobidea
{
	public void app() {
		System.out.println("app bluprint of helper2");
		
	}
	public void appview()
	{
		
		System.out.println("desining app view of helper2");
		
	}
	public void appdata()
	{
		
		System.out.print("implementing app data helper2");
		
	}
	public void graphic()
	{
		
		System.out.println("implemting graphical interface of helper2");
	}
	public void blueprint()
	{
		
		System.out.println("blueprint of helper2");
	}
}
public class Interface
{
	public static void main(String [] args)
	{
		Mobidea ap1=new Helper();
	  	System.out.println("appideas of helper");
	  	ap1.app();
	  	ap1.appdata();
	  	ap1.appview();
	  	ap1.graphic();
	  	ap1.blueprint();
	  	System.out.println(Mobidea.a);
	  	System.out.println("============================");
	  	Appidea ap=new  Helper2();
		System.out.println("appideas of helper2");
		
		ap.app();
	  	ap.appdata();
	  	ap.appview();
	  	ap.graphic();
	    Helper2 ap3=(Helper2)ap;//downcasting
	  	ap3.blueprint();
	    System.out.println("===================");
	  	Appidea ap2=new Helper1();
        
        System.out.println("overidden ideas  of helper1");
        
        ap2.app();
        ap2.appview();
        System.out.println("===================");
		
		
		
		
	}
	
	
	
	
	
	
}

