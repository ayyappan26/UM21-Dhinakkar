
package testing;

public class Access1 {

	
	public String b="gotham";
	
	int a;
	
	protected float  value=9.89f;
	
	private double d;
	
	
	protected void getd(double a)
	{
		d=a;
		System.out.println(d);
		
	}
	protected void visibility()
	{
		System.out.println("default accessmod");
	}
	
	
	
	public static void main(String[] args) 
	{
	   
     Access1 ob=new Access1();
     System.out.println(ob.b);
		
		
		
	}

}
