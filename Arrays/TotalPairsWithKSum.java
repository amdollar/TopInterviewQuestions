package io.test.Arrays;

import java.util.Arrays;

/**
 * find the number of pairs with given sum int the array
 */
public class TotalPairsWithKSum {

	public static void main(String[] args) {

		int[] arr = new int[] { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		System.out.println(totalPairs(arr, sum));

	}

	private static int totalPairs(int[] arr, int sum) {
		Arrays.sort(arr); // {1,2,3,5,7,8}
		int res = 0;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] + arr[right] == sum) {
				System.out.println(arr[left] + "," + arr[right]);
				res++;
			}
			if (arr[left] + arr[right] < sum) {
				left++;
			} else {
				right--;
			}

		}

		return res;
	}

}
