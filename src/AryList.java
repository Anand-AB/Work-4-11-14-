import java.util.ArrayList;

public class AryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> List=new ArrayList <String>();
		List.add("Kattakada");
		List.add("Balaramapuram");
		List.add("Neyyatinkara");
		System.out.println(List);

		List.add("Malayinkeezhu");
		System.out.println(List);

		List.remove(2);
		System.out.println(List);

		String state=List.get(0);
		System.out.println("New taluk in Trivandrum is "+state);

		int pos=List.indexOf("Balaramapuram");
		System.out.println("Balaramapuram is at position "+pos);
	}

}
