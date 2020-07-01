package io.test.Arrays;

public class RotateArrayK {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;
		for (int i : arr) {
			System.out.print(i + " ");
		}
		rotate(arr, k);
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void rotate(int[] nums, int k) {
		int len = nums.length - 1;
		while (k > 0) {
			int right = len;
			int temp = nums[right];
			while (right >= 1) {
				nums[right] = nums[--right];
			}
			nums[0] = temp;
			k--;
		}
	}

}
