package dhinu;

public class Van {
  private String color;
  public static int b=20;
  public int num=50;
  public static String wheel;
  public String name="goingtrip";
  public int value=60;
  public String ko;
  public void setcolor(String a)
  {
       this.color=a;
        color="green";
    }
    public String getcolor()
    {
    	return color;
    }
    public Van(String n,int value)
    {
        
    	 String newname=n.concat(this.name);
    	 
    	 
    	System.out.println("newnmae"+" "+newname);	 
   }
    public Van(int v)
    {
      int newvalue=v+this.value;   
     	
      System.out.println("newvalue"+" "+newvalue);	 	
    }
    public Van(String ko)
    {
    	this.ko=ko;
    }
    public String toString()
    {
    	return ko;
    }
    
    
    public  void stat(int i)
    {
        b=i;
        b++;
        b++;
        b++;
        System.out.print("static vlaue"+" "+b);
    }
    
    
    
    public void nonstat(Van og)
    {
    	
    	System.out.println("call by ref"); 
    	og.num=og.num+100;
        num++;
        num++;
        num++;
        System.out.println("insidenonstatic vlaue"+" "+num);
    }
     public static String vanwheel(String wheel)
     {
    	 Van.wheel=wheel;
          
    	 return wheel;    	 
    	 
    	 
    	 
     }
      public  void  stringop()
      {
    	  String name="Van is used for transport";
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
        public static void main(String[] args) {
	 
	    Van og=new Van("dhinu",50);
	    Van og2=new Van("RKO");
	    Van og1=new Van(20);
	    og2.setcolor("red");
	    System.out.println(og.getcolor());
        og1.nonstat(og);
        System.out.println("outside value"+og.num);
        System.out.print(og2);//toString method
       
        }
}
 
