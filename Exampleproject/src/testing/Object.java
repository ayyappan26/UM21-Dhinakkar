package testing;
 
class Twowheeler
{
	
	public void tires()
	{
		System.out.println("two wheeler has tires");
	}
	//public String wheeling()
	//{
		///System.out.println("bike we can do wheeling");  we cannot do has a relationship on overriden methods
	//	return new Eng().oil();
	    
	//}
}	
class Bike extends Twowheeler
{
	private String b;
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void tires()
	{
		System.out.println("Bike  has tires");
	}
	public int headlight() 
	{
	System.out.println("Bikes headlight");	
    return new Eng().piston();
	}
	public String wheeling()
	{
		System.out.println("bike we can do wheeling");
		return new Eng().oil();
	    
	}
	public void settb(String n)
	{
		b=n;
		System.out.print("setted b");
	}
	public String getb()
	{
		return b;
	}
    
}
class Eng
{
	
		
	public String oil()
	{
		System.out.println("change the oil  for bike");
		String p="oil";
		return p;
	}
	public int piston()
	{
		int pi=50;
		System.out.println("bike engine have piston");
		return pi;
	}
	
}
class Gearbox extends Eng
{
	
	public void gears()
	{
		System.out.println("speeed up");
	}
}
class Display
{
	public void setter(Bike o)
	{
		o.headlight();
		o.setA(90);
		o.settb("dhinu");
		
	}
	public void getter(Bike p) 
	{
		p.getA();
		p.getb();
	   
	}
	
	
	
}




public class Object
{
	public static void main(String [] args)
	{
		Bike og=new Bike();
		og.wheeling();
		System.out.println(og.headlight());
	    Display oj=new Display();
	    System.out.println("==========");
	    oj.setter(og);
	    oj.getter(og);
	
	}
}