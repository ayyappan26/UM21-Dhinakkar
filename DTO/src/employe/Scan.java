package employe;
import java.util.Scanner;
	public class Scan {
	  
	private static Scanner scan;
		     
		private Scan()
		{
				
		}
		public static Scanner getinstance() {
			if(scan==null)
			{
				scan=new Scanner(System.in);
			}
			
			return scan;
			
		}
		
		
	}

