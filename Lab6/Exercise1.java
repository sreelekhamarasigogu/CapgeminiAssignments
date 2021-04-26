package lab6;
import java.util.*;

public class Exercise1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List sortByValue(HashMap<String, Integer> map) {
		 @SuppressWarnings({ })
		List list = new LinkedList(map.entrySet());
	        // Defined Custom Comparator here
	        Collections.sort(list, new Comparator() {
	             public int compare(Object o1, Object o2) {
	                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
	             }
	        });
			return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();

        map.put("jonas", 10);
        map.put("claudia", 30);
        map.put("lekha", 20);
        List<?> list = sortByValue(map);
        System.out.println(list);
	}

}
