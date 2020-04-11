import java.util.*;

public class ListManipulator {
	
	public ArrayList<Integer> sort(ArrayList<Integer> myLst, boolean ascending) {
		if(ascending) {
			Collections.sort(myLst);
			return myLst;
		}
		else {
			Collections.sort(myLst, Collections.reverseOrder());
			return myLst;
		}
	}
	
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
		//finding max
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		for(int i = 0; i<myLst.size(); i++) {
			if(max>myLst.get(i)) {
				max = myLst.get(i);
				maxIndex = i;
			}
		}
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 0; i<myLst.size(); i++) {
			if(min<myLst.get(i)) {
				min = myLst.get(i);
				minIndex = i;
			}
		}
		
		Collections.swap(myLst, maxIndex, minIndex);
		return myLst;
	}
	
	
	public void table(ArrayList<Integer> myLst) {
		Collections.sort(myLst);
		Map<Integer, Integer> occurrenceMap = new HashMap<Integer, Integer>();
		for(int i = 0; i<myLst.size(); i++) {
			if(occurrenceMap.containsKey(myLst.get(i))) {
				occurrenceMap.put(i,occurrenceMap.get(i)+1);
			}
			else {
				occurrenceMap.put(i,1);
			}
		}
		
		for(int i: myLst) {
			System.out.println(i);
		}
		for(int i : occurrenceMap.keySet()) {
			System.out.println(i);
		}
	}
	

}
