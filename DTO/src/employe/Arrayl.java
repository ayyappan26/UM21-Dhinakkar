package employe;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class Arrayl
{
 public static void Arraylist()
 {
	 
 
  ArrayList<Integer> ar=new ArrayList<Integer>();
  
    ar.add(50);
    ar.add(67);
    ar.add(78);
    ar.add(45);
    ar.add(34);
    ar.add(65);
    ar.add(90);
    ar.add(34);
    ar.add(1);
    ar.add(0);
    ar.add(60);
 
   int size=ar.size();
 
   
   Collections.sort(ar);
   
   Collections.sort(ar,Collections.reverseOrder());
   
   for(int i=0;i<size;i++)
   {
	   System.out.println(ar.get(i));
   
   }
   
 }
   public static void list()
   {
	   
	   List<String> st=new ArrayList<String>();
	   st.add("dhinu");
	   st.add("abc");
	   st.add("efg");
	   
	   List<String> st1=new ArrayList<String>();
	   st1.add("higk");
	   st1.add("lmno");
	   st1.addAll(st);
   
   
      for(int i=0;i<st1.size();i++)
      {
    	  System.out.println(st1.get(i));
      }
   
   }
  public static void set()
  {
	  
	  
	   
	   Set<String> st=new HashSet<String>();
	   st.add("java");
	   st.add("c");
	   st.add("python");
	   st.add("javascript");
	  
	   System.out.print(st);
	  
  }
 
 public static void main(String [] args)
{
	Arraylist();
    list();
    set();
}

}



