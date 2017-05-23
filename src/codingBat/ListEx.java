package codingBat;

import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(); 
		integers.add(3);
		integers.add(4);
		integers.add(5);
		
		List<Integer> integers2 = Arrays.asList(5,4,3);
		List<Integer> integers3 = new ArrayList<>(integers);
		
		System.out.println("Kolm loodud listi: ");
		System.out.println(integers);
		System.out.println(integers2);
		System.out.println(integers3);
		
		System.out.println("\nListi läbimine for-each");
		
		// for-each
		for (Integer item : integers) {
			System.out.println(item);
		}
		
		System.out.println("\nListi läbimine for tsükliga");
		// for-loop
		for (int i = 0; i < integers.size(); i++) {
			System.out.println(integers.get(i));
		}
		
		
		System.out.println("\nMassiivi väljaprint:");
		int[] nums = { 6, 7, 8 };
		System.out.println(Arrays.toString(nums));
	}

}
