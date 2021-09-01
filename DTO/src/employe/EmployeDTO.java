package employe;

import java.util.Scanner;

	 class Emp {
	   
	    
		 
		 
		 public EmpDTO[] Empdetails()
		 
		 { 
		   
			 
			 
			 Scanner sc=Scan.getinstance();
			 
			 int count=sc.nextInt();
			
			 EmpDTO emp[]=new EmpDTO[count];
				
			  System.out.println("total number of employe"+count);
			 
			  
			  EmpDTO empob=null;
			  
			  for(int i=0;i<emp.length;i++)
		    {
				 empob=new EmpDTO();
				System.out.println("empid");
		       empob.setEmpid(sc.nextInt());
		    	System.out.println("frist name");
		    	empob.setFristname(sc.next());
		    	System.out.println("last name");
		    	empob.setLast_name(sc.next());
		    	System.out.println("salary");
		    	empob.setSalary(sc.nextFloat());
		    	System.out.println("department");
		    	empob.setDepartment(sc.next());
		        emp[i]=empob;	
		    }
			  return emp;
		 }
		  
		    
		    public void printdetails(EmpDTO em[])
		    {
		    	
		    	 EmpDTO empob=null;
		    	 for(int i=0;i<em.length;i++)
		    	{
		    		 empob=new EmpDTO();
		    		 empob= em[i];	
		           
		    		 System.out.println("empid"+" "+empob.getEmpid());
		    	    System.out.println("frist name"+" "+empob.getFristname());
		    	    System.out.println("last name"+" "+empob.getLast_name());
		    	    System.out.println("salary"+" "+empob.getSalary());
		    	    System.out.println("department"+"  "+empob.getDepartment());
		    	
		     }
			 
			 
			 
		 }
		 
		 
		 
		 
		 
	 }
		 
		 
		 
	 
		 
		 
		 
		 
	public 	 class EmployeDTO
		 {
			 public static void main(String [] args)
			 {
			    Emp obj=new Emp();
			    EmpDTO e[]=obj.Empdetails();
				obj.printdetails(e);
			}
		
			 
		 }
	
	

