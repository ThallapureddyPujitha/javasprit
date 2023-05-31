package map1;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Mapex {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(1,"amit");
		m.put(2,"puji");
		m.put(3,"vasu");
		m.put(4,"jeevani");
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry ent=(Map.Entry)itr.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
			
		}
	}
}
