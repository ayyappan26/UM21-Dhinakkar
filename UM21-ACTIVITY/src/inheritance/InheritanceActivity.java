package inheritance;

class Employe
{
	
    public  long employeID;
    public 	String employeeName;
	public String employeAddress;
	public long employePhone;
	public double basicSalary;
	public double specialAllowance=250.80;
    public double hra=1000.50;
		
	Employe()
	{
		
	}
	
	public Employe(long  id, String Name, String Address, long phone) {
		
		this.employeID = id;
		this.employeeName = Name;
		this.employeAddress = Address;
		this.employePhone = phone;
		
	}
  public void  calculateSalary()
  {
	  
   	 
	  
	  double salary=(basicSalary*specialAllowance/100)*(basicSalary*hra/100);
	   
	
	  System.out.println("calculate salary:"+salary); 
  }

	public void calculateTransportAllowance() 
	{
		
		double transportAllowance=10/100*basicSalary;
		System.out.println(transportAllowance);
   }
	  
  }
class Manager extends Employe
{
	public Manager(long  id, String Name, String Address, long phone,double salary) {
		
		this.employeID = id;
		this.employeeName = Name;
		this.employeAddress = Address;
		this.employePhone = phone;
		this.basicSalary=salary;
}
	public void calculateTransportAllowance() 
	{
		
		double transportAllowance=15*basicSalary/100;
		System.out.println("salary:"+" "+transportAllowance+basicSalary);
   }

}
class Trainer extends Employe

  {
	  
	  public Trainer(long  id, String Name, String Address, long phone,double salary) {
			
		    this.employeID = id;
	     	this.employeeName = Name;
			this.employeAddress = Address;
			this.employePhone = phone;
			this.basicSalary=salary;
		}
	  public void calculateTransportAllowance() 
		{
			
			double transportAllowance=specialAllowance;
		    System.out.println("salary of trainer:"+" "+transportAllowance+basicSalary);	
	   }
	  
  }

public class InheritanceActivity {

	public static void main(String[] args) {
		  Manager ob=new Manager(126534,"Peter","Chennai India",23784,65000);
          ob.calculateSalary();
	      Trainer ob1=new Trainer(29846,"Jack","Mumbai india",442085,45000);
	      ob1.calculateSalary();
	      ob.calculateTransportAllowance();
	      ob1.calculateTransportAllowance();
	}

}
