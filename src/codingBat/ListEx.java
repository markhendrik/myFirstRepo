package codingBat;

import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		List<Integer> testList1 = Arrays.asList(7, 2, 3, 5, 4);
		List<String> testList2 = Arrays.asList("lamp", "kass", "kollane", "ei", "ja");
		// System.out.println(getMax(testList1));
		System.out.println(getEvenNums(testList1, true));
		System.out.println(getSquareValue(testList1));
		System.out.println(lessThanN(testList2, 5));
		/*
		 * List<Integer> integers = new ArrayList<>(); integers.add(3);
		 * integers.add(4); integers.add(5);
		 * 
		 * List<Integer> integers2 = Arrays.asList(5,4,3); List<Integer>
		 * integers3 = new ArrayList<>(integers);
		 * 
		 * System.out.println("Kolm loodud listi: ");
		 * System.out.println(integers); System.out.println(integers2);
		 * System.out.println(integers3);
		 * 
		 * System.out.println("\nListi läbimine for-each");
		 * 
		 * // for-each for (Integer item : integers) { System.out.println(item);
		 * }
		 * 
		 * System.out.println("\nListi läbimine for tsükliga"); // for-loop for
		 * (int i = 0; i < integers.size(); i++) {
		 * System.out.println(integers.get(i)); }
		 * 
		 * 
		 * System.out.println("\nMassiivi väljaprint:"); int[] nums = { 6, 7, 8
		 * }; System.out.println(Arrays.toString(nums));
		 */
	}// end of main

	// 1. Meetod, mis tagastab listi suurima elemendi.
	// getMax([2, 5, 1]) -> 5
	private static Integer getMax(List<Integer> list) {
		Integer max = list.get(0);
		for (Integer integer : list) {
			if (integer > max) {
				max = integer;
			}
		}
		return max;
	}

	// TODO
	// 2. Meetod, mis tagastab listi kõik paarisarvud.
	// getEvenNums([1, 4, 3, 2 ]) -> [4, 2]
	private static List<Integer> getEvenNums(List<Integer> list, boolean even) {
		List<Integer> result = new ArrayList<>();
		/*
		 * for (int i = 0; i < list.size(); i++) { if (list.get(i) % 2 == 0) {
		 * result.add(list.get(i));
		 */
		for (Integer integer : list) {
			if (integer % 2 == 0) {
				result.add(integer);
			}
		}
		return result;
	}

	// 3. Meetod, mis tagastab etteantud listi ruutu võetud väärtustega.
	private static List<Integer> getSquareValue(List<Integer> list) {
		List<Integer> result = new ArrayList<>();
		for (Integer integer : list) {
			result.add((int) Math.pow(integer, 2));

		}
		return result;
	}

	// 4. Meetod, mis võtab etteantud massiivist välja kõik lühemad kui
	// kolmetähelised sõnad ja tagastab listina
	private static List<String> lessThanN(List<String> list, int n) {
		List<String> result = new ArrayList<>();
		for (String string : list) {
			if (string.length() < n) {
				result.add(string);
			}
		}
		return result;
	}

}
