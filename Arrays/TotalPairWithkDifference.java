package io.test.Arrays;

import java.util.Arrays;

public class TotalPairWithkDifference {

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 7, 2, 5, 4, 1 };
		int difference = 1;
		System.out.println(totalPairs(arr, difference));
	}

	private static int totalPairs(int[] arr, int difference) {
		int res = 0;
		Arrays.sort(arr);// {1,2,4,5,7,8}
		int left = 0;
		int right = 1;

		while (right < arr.length) {
			if (arr[right] - arr[left] == difference) {
				System.out.println(arr[left] + "," + arr[right]);
				res++;
			}
			left++;
			right++;
		}

		return res;
	}

}
