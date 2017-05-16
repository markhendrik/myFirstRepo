import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		ArraysEx ae = new ArraysEx();
		int[] array1 = { 2, 3, 4 };
		int[] array2 = { 7, 5, 6, 5, 7, 6, 5 };

		for (int i = 0; i < array2.length; i++) {
			//System.out.println(array2[i]);
		}
		// === samaväärne for each-tsükkel 
		for (int item : array2) {
			//System.out.println(item);
		}
		
		// System.out.println(ae.firstLast6(array1));
		//System.out.println(ae.commonEnd(array1, array2));
		//System.out.println(Arrays.toString(ae.reverse3(array1)));
		//System.out.println(ae.maxElement(array2));
		//System.out.println(ae.getFirstEven(array2));
		System.out.println(ae.countFive(array2));
	}

	// Meetod, mis tagastab etteantud massiivi ruutu võetud tulemustega
	// massiivi.
	// powArray([2, 4, 6]) -> [4, 16, 36]

	public int[] powArray(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i] * array[i];
		}
		return result;
	}

	public boolean firstLast6(int[] nums) {
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}

	public boolean commonEnd(int[] a, int[] b) {
		int firstA = a[0];
		int firstB = b[0];

		int lastA = a[a.length - 1];
		int lastB = b[b.length - 1];

		return firstA == firstB || lastA == lastB;
		// return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
	}

	public int[] reverse3(int[] nums) {
		int[] result = new int[nums.length];
		int arrayLen = nums.length - 1;
		
		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[arrayLen - i];
		}
		return result;
	}
	
	//1. Näide tahvlil: suurima arvu leidmine täisarvulisest massiivist
	public int maxElement(int[] elements) {
		int max = elements[0];
		for (int element : elements) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}
	
	//2. Näide tahvlil: esimese paarisarvu leidmine massiivist.
	public int getFirstEven(int[] elements) {
		for (int element : elements) {
			if (element % 2 == 0) {
				return element;
			}
		}
		return -1;
	}
	
//	6.Näide tahvlil: Meetod, mis ütleb, mitu number 5 on massiivis.
	public int countFive(int[] elements) {
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == 5) {
				count++; //count = count + 1; // count += 1;
			}
		}
		return count;
	}
}
