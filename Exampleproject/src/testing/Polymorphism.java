package testing;

class Parent {
	 
    
	public  void behaviour()
	{
		
		System.out.println("behaviour of parent");
		
		
	}
	public void behaviour(int a,String b)
	{
		
		System.out.println("behaviour of parent1"+a+" "+b);
		
	}
	public void behaviour(int c,int d)
	{
		
		
		System.out.println("behaviour of Parent2"+c+" "+d);
   }
	static void properties()
	{
		System.out.println("static of parent");
		
	}

  public void indenticalface(int l,int u) 
  {
	  System.out.println("faceof parent"+l+" "+u);
  }
  
  
}	
	 
class Subclass1  extends Parent  
{
	Subclass1()
	{
		
		
		
		
	}
	
	Subclass1(String a,String b)
	{
		int k=a.compareTo(b);
		System.out.println("compared"+k);
	}
	
	public void behaviour()
	{
		
		System.out.println("behaviour of subclass1");
		
	}
	public void behaviour(String e,int f)
	{
		
		System.out.println("behaviour of subclass1"+e+" "+f);
		
		
	}
	public void indenticalface() 
	  {
		  System.out.println("faceof subclass1");
	  }
	
	public void indenticalface(int k,int o) 
	  {
		  System.out.println("faceof subclass1"+k+" "+o);
	  }
	static void properties()
	{
		System.out.println("static of  subclass1");
		
	}
	
	
	
	public void color() 
	{
		
	System.out.println("subclass1 color");	
		
	}
}
class Subclass3 extends Parent
{
	public void indenticalface(int lo,int u) 
	  {
		  System.out.println("faceofsubclass3"+lo+" "+u);
	  }
	public void color() 
	{
		
	System.out.println("subclass3 color");	
		
	} 
	 
	
}

class Subclass2 extends Subclass1
{ 
	public void behaviour()
	{
		
		System.out.println("behaviour of subclass2");
		
	}
	public void indenticalface() 
	  {
		  System.out.println("faceof subclass2");
	  }
  
	public void color()
 {
	 System.out.println("subclass2");
 }

}

public class Polymorphism extends Subclass2
 {
	public static void main(String [] args)
	{
		System.out.println("compile time polymorphism without extends");
		
		Subclass1 ok1=new Subclass1();
		ok1.indenticalface(80,70);
		
		Parent ob=new Subclass1("dsad","okk");//upcasting
		ob.indenticalface(70,80);
		ob.behaviour(56,78); 
        Parent. properties();
	
        ob.indenticalface(0, 0);
		Subclass2  ob1=new Subclass2();
		ob1.behaviour("dhinu",90);
		System.out.println("run time polymorphism with extends");   	
	    Parent oj=new Parent();
	    oj.behaviour();
	   
	    Subclass1 ko=(Subclass1)ob;//downcasting
	    ko.indenticalface();
	    ob.behaviour(100,"Sdsa");
	    Subclass1 ok=new Subclass2();
	    ok.color();
	
	    Parent koi=new Subclass3();
	    //koi.color();
	    Subclass3 sub=(Subclass3)koi;
	    sub.color();
	    sub.color();
	}
	
	
	
 }
