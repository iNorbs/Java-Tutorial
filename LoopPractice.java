/*
 * Made by Norbert Moroz
 * 
 * I'm keeping this short and simple, because I know
 * you guys don't want to spend time on coding, this is the very
 * basics, and give yourself a high five when you got all the
 * answers correct!
 */

package Practice; //TODO Change this if the directory you'll be holding this folder is not called Practice

import java.util.Arrays; //Do not remove this

public class LoopPractice {	
	
	/**
	 * Checks if the contents of list are all equal
	 * 
	 * @param integer array named list
	 * @return true if list has all the same values, false if otherwise
	 */
	public static boolean allSame(int[] list) {
		return true; //TODO Fix This
	}
	
	/**
	 * Checks if the contents of list are all positive values
	 * 
	 * @param integer array named list
	 * @return true if list has any negatives (<0), false if otherwise
	 */
	public static boolean hasNegative(int[] list) {
		return true; //TODO Fix this
	}
	
	public static void main(String[] args) {
		int[] arr1 = {5, 5, 5, 15, 5};
		int[] arr2 = {5, 5, 5, 5, 5};
		int[] arr3 = {1, 10, 10, 10, 10};
		int[] arr4 = {7, 7, 7, 7, 7, 9};
		int[] arr5 = {10, 17, 12, 50, -12};
		int[] arr6 = {-4, -4, -4, -4};
		
		//allSame tests
		allSameTest(arr1, false);
		allSameTest(arr2, true);
		allSameTest(arr3, false);
		allSameTest(arr4, false);
		allSameTest(arr6, true);
		
		//hasNegative tests
		hasNegativeTest(arr1, false);
		hasNegativeTest(arr3, false);
		hasNegativeTest(arr5, true);
		hasNegativeTest(arr6, true);
		
		System.out.println("Finished tests");
	}
	
	private static void allSameTest(int[] list, boolean expected) {
		boolean actual = allSame(list);
		if (actual != expected) {
			System.out.print("All same test error with array: ");
			System.out.println(Arrays.toString(list));
		}
	}
	
	private static void hasNegativeTest(int[] list, boolean expected) {
		boolean actual = hasNegative(list);
		if (actual != expected) {
			System.out.print("Has negative test error with array: ");
			System.out.println(Arrays.toString(list));
		}
	}
}
