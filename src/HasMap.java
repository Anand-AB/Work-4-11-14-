import java.util.HashMap;


public class HasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("kerala","Trivandrum");
		map.put("TamilNadu","Chennai");
		map.put("karnataka","bangloor");
		
		System.out.println(map);
		
		String cap=map.get("kerala");
		System.out.println("The capital of Kerala is "+cap);
		
		map.remove("TamilNadu");
		System.out.println(map);
	}

}
