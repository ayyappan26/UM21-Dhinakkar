package employe;



	public class EmpDTO {
		  public int empid;
		  public String fristname;
		  public String last_name;
		  public float salary;
		  public String department;
		  
		 
		  public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			//empid=sc.nextInt();
			this.empid = empid;
		}
		public String getFristname() {
			return fristname;
		}
		public void setFristname(String fristname) {
			//fristname=sc.next();
			this.fristname = fristname;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			//last_name=sc.next();
			this.last_name = last_name;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			//salary=sc.nextFloat();
			this.salary = salary;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			//department=sc.next();
			this.department = department;
		}

		}
		  

