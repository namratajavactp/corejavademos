import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class RawMapCollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map contacts = new HashMap();
		contacts.put(new Long(9912345678L), "Jenny");
		contacts.put(new Long(9912345679L), "Johny");				
		Set contactValues = contacts.entrySet();
		Iterator contactIterator = contactValues.iterator();
				
		while (contactIterator.hasNext())
		{
		    Map.Entry anEntry = (Map.Entry)contactIterator.next(); // Line A
		    Long number = (Long)anEntry.getKey(); // Line B
		    String name = (String)anEntry.getValue(); // Line C
		    System.out.println(number + ":" + name);		
		}
	}

}
