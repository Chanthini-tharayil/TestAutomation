package prepstring;

import java.util.HashMap;

public class comparetwomap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> map1 = new HashMap<>();
		 
	        map1.put(1, "A");
	        map1.put(2, "B");
	        map1.put(3, "C");
	         
	        //Same as map1
	        HashMap<Integer, String> map2 = new HashMap<>();
	 
	        map2.put(3, "C");
	        map2.put(1, "A");
	        map2.put(2, "B");
	        System.out.println(map1.equals(map2));
	}

}
