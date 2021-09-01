package testing;




class Laptop{
  
	private String model;
	private String ramsize;
	private  String processorType;
   private  String companyname;
   
    public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
	private int purchaseYear;


   public int getPurchaseYear() {
		return purchaseYear;
	}
	public void setPurchaseYear(int purchaseYear) {
		this.purchaseYear = purchaseYear;
	}
public void setmodel(String model)
   {
	   this.model=model;
	   
	   
   }
  public String getmodel()
  {
	  return model;
	  
	}
   public void setramsize(String ramsize)
   {
	   this.ramsize=ramsize;
	   
   }
  public String getramsize()
  {
	  
	  return ramsize;
	  
  }
  public void setProcessorType(String processorType) {
		this.processorType = processorType;
	 
 }
  public String getprocessorType() 
  {
	return processorType;  
	  
  }

}
class Call
{
	
	public void details(Laptop lap)
	{
		
		System.out.println(lap.getmodel());
		System.out.println(lap.getPurchaseYear());
		System.out.println(lap.getprocessorType());
	    System.out.println(lap.getramsize());
	}
	
	
	
	
}
public class Testclass
{
	public  static void main(String [] args)
	{
		
		Laptop lap=new Laptop();
		
		lap.setmodel("inspiron");		
		lap.setProcessorType("i3");
		lap.setramsize("3gb");
		lap.setCompanyname("dell");
		lap.setmodel("ins");
		Call oj=new Call();
		oj.details(lap);
	   
         System.out.println("----------------------------------");
		
         Laptop lap1=new Laptop();
		
		lap1.setmodel("ins");		
		lap1.setProcessorType("i5");
		lap1.setramsize("4gb");
		lap1.setCompanyname("dell");
		
		
		oj.details(lap1);
	
		System.out.println("----------------------------------");
			
		 Laptop lap2=lap;
		  
		 lap2.setProcessorType("i9");
		 
		 oj.details(lap2);
		 
		 //lap2.setProcessorType("i9");
		 
		 //oj.details(lap2);
		 
	     
	
	   System.out.println("=-------------");
	
	    oj.details(lap);
	}
}
	
	
	
	
	
	
