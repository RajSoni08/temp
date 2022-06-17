import java.util.ArrayList;
import java.util.Iterator;

public class Arr {

	public static void main(String[] args) {
           System.out.println("Hello World");
           String S="RAj";
           ArrayList<String> list = new ArrayList<String>();
   			list.add(S);
   			list.add("Rahul");
   			
   		System.out.println("hddh");
      Iterator itr= list.iterator();
      while(itr.hasNext())
      System.out.println(itr.next());
	}

}
