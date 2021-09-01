package testing;

class Mobile   {

	   String  battery;
	   String  simslot;
	   String  memorycard;
	   String ram;
	   String features;
	   Mobile()
	   {
		   this("new features","dual sim");
		System.out.println("Mobile details");   
		   
		   
	   }
	   Mobile(String m,String l)
	   {
		   features=m;
		  simslot=l; 
	      
	   }
	   
  
}
class Realme extends Mobile
{
	String modelname;
	String camera;
	String internal;
	

	
	
	
	
	Realme()
 	{
	 
	 super();
	 
	 
 	}
	
	
	Realme(String b1,String m1,String r1,String mn1, String i1)
	{
	 this.battery=b1;	
	 this.memorycard=m1;
	 this.ram =r1;
	 this. modelname =mn1;
	 this.internal=i1;
	}
	public void display() {
		  
		System.out.println(this.battery+" "+this.memorycard+" "+ this.ram +" "+this. modelname +" " +this.internal) ;
		}
	 public void  dis() {
		    System.out.println( this.features+" "+this.simslot);
	   }
}	
class Jio extends Realme
{
   
	Jio()
	{
		
	}
	Jio(String b2,String m2,String r2,String mn2,String i2)
	{
	 this.battery=b2;	
	 this.memorycard=m2;
	 this.ram =r2;
	 this. modelname =mn2;
	 this.internal=i2;
	}

}
public class Result extends  Jio
{
	
	 public static void main(String [] args)
	   {
		  // Mobile mob=new Mobile();
		   Realme ob=new Realme("5000mah","32gb","4gbram"," realme a3","64gbinternal");
		   Jio ob1=new Jio("4000mah","64gb","8gbram","relame a3","128gb internal");
		   Mobile mb=new Mobile();
		   ob.dis();
		     
		   ob.display();
		   ob1.display();
	   }
	   
}


	

	
	
	
	   
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

