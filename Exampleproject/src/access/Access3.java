package access;

import testing.Access1;
import testing.Access2;
public class Access3 extends Access1{
  
	double val;
	  public  void getd(double a)    
	{
		 val=a;
		 System.out.println(val);
		
	} 
	 /*private  void getd(double a)    //cannot reduce the visibility of overiden meth
		{
			 val=a;
			 System.out.println(val);
			
		}*/ 
	    public void visibility()       
		{
			System.out.println("default accessmod");
		}
	
	
	public static void main(String [] args)
	 {
		 
		 Access3 ob2=new Access3();
		 Access1 on=new Access1();
		 System.out.println(on.b);
		 System.out.println(ob2.value);
		 ob2.visibility();  //accessing default by changing visibility
		 ob2.getd(98.56);
	    // ob2.visibility();default we cannot access outside a class 
	 }
}
