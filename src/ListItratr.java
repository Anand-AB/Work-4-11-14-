import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class ListItratr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> List=new ArrayList <String>();
		List.add("Kattakada");
		List.add("Balaramapuram");
		List.add("Neyyatinkara");
		System.out.println(List);

		List.add("Malayinkeezhu");
		System.out.println(List);

		ListIterator<String> listItr=List.listIterator();
		while(listItr.hasNext())
		{
			String value=listItr.next();
			System.out.println(value);
		}
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("kerala","Trivandrum");
		map.put("TamilNadu","Chennai");
		map.put("karnataka","bangloor");
		System.out.println(map);
		
		Set<String> keys=map.keySet();
		Iterator<String> iterator=keys.iterator();
		while(iterator.hasNext())
		{
			String value=iterator.next();
			System.out.println("The capital of "+value+"is "+map.get(value));
			
		}
	}

}
