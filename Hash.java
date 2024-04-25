package Map;
import java.util.HashMap;
import java.util.*;
public class Hash {
	//Order of insertion are not allowed both null value and null key

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(01, "Shri");
		hm.put(null, null);
		hm.put(03, "Rohit");
		hm.put(03, "Riddhi");
		hm.put(05, "Siddhi");
		hm.put(06, "Pranav");
		System.out.println(hm);
		LinkedHashMap obj=new LinkedHashMap();
		obj.put(hm, "shri");
		System.out.println(obj);
		//hm.put(hm, obj);
		System.out.println(hm);
		

	}

}
