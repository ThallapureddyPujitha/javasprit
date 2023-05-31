package map1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Changemap {
	public static void main(String[] args) {
		Map<Integer,Integer> m=new HashMap();
		m.put(1,2);
		m.put(2,3);
		m.put(3,4);
		m.put(4,5);
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry ent=(Map.Entry)itr.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
			
		}
	}

}
