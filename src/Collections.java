import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

	public void List() {
		// TODO Auto-generated method stub
     List<String>lists=new ArrayList<>();
     lists.add("java");
     lists.add("Selenium");
     lists.add("java");
     lists.add("Aadvika");
     lists.remove(3);
     System.out.println(lists.contains("java"));
     System.out.println("Index:"+lists.get(0));
     //lists.clear();
     System.out.println(lists.size());
     System.out.println("List:"+lists);// allowed duplicates
     for (int i = 0; i < lists.size(); i++) {
    	    System.out.println("forloop"+lists.get(i));
    	    for (String s : lists) {
    	        System.out.println("foe each"+s);
    	    }

    	}

	}
	public void Set() {
		
		Set<String>set=new HashSet<>();
		set.add("Java");
		set.add("Automation");
		set.add("Java");
		//set.clear();
		set.contains(set);
		System.out.println("Set:"+set);
		
		
	}
	public static void main(String[] args) {
		Collections collection=new Collections();
		collection.List();
		collection.Set();
	}
}
