package testing;
import access.Access3;
public class Access2 extends Access3 {

	
	public static void main(String [] args)
	{
	    Access3 o=new Access3();
		Access2 ob1=new Access2();	
		Access1 oj=new Access1();
	    System.out.println("access1 class"+oj.b);
		System.out.println(" access1 class  "+oj.a);
		System.out.println(" access1 class  "+oj.value);
		oj.getd(90.8);
	  	oj.visibility();
		
		
	}
	
	
	
	
	
}
