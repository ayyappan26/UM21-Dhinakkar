package dhinu;

public class Pen {
     
     
	
	public Pen()//constructor
    {
  	
  	 number ++;
  	 number++;
  	 number++;
  	 System.out.println("inside the method"+number);
  	  
    }
	
     public static void main(String[] args) {
	  System.out.println(name);
	    
	   throwing();
      
       
      Pen  o=new Pen("Vijay");
      Pen  o1=new Pen();  
     
      Pen  o3=new Pen(9.08,"dugati");
      Car bi=new Car("bike");
      Car bi1=new Car();
      System.out.println( o.chair);
  
       o.writing();
      
      System.out.println("outside the method"+number);//53
      
     Car.win();
      
    
     }
      
      Pen(String a)
      {
    	  
    	  System.out.println(a);
    	  
      }
      Pen(String v,int b)
      {
    	  System.out.println(v+" "+b);
     }
      Pen(int ki,float mi)
      {
    	  this.product();//chair 
    	  System.out.print(this.chair);
    	  System.out.println(ki+" "+" "+mi);
    	  
    	  
      }
      Pen(double d,String o)
      {
    	  this(90,8.9f);
    	  System.out.println(d+" "+o);
      }
     
     
    public static int number=50;
	public static String name="camlin";
    public static String thr="throw";
    public  static int price;
    String chair="blue";//non static variable can be used in static method
    
     public  void writing()
	{
		System.out.println("im writing in "+name);
		
	}
    public  static void  throwing()
    {
    	
    	System.out.println("im "+thr);
    	
    }
    public static void calprice()
    {
    	
    	price=500;
    	
    	int incre=price+100;
    
        System.out.println(incre);
    }
    public void product()
    {
    	
      System.out.println(chair);
    	
     }
   public static void incre() {
    	
    	System.out.println("inside the method before"+number);
    	
    	number=number+50;
    	
    	System.out.println("inside the method after"+number);
       
   }
	
 }
class Car extends Pen
{  
	
	 public  static void  win()
	  {
		  incre();
		  System.out.print("p");
		  
    }
	
	 Car(String k)
	 
	 {
	     super("ko");
		 System.out.println(k);
		 
	 }
	 
	 Car()
	 
	 {
		 super();
		 System.out.println("dasdad");
		 
		 
	 }
	 
	
			}