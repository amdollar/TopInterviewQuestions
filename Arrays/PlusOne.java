package io.test.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = new int[] { 9, 9 };

		int[] res = plusOne(digits);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i] = digits[i] + 1;
				return digits;
			}
			digits[i] = 0;
		}
		int[] res = new int[digits.length + 1];
		res[0] = 1;
		return res;
	}
}
