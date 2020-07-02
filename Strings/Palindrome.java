package io.test.Strings;

public class Palindrome {

	public static void main(String[] args) {
		String line = new String("race a car");
		System.out.println(isPalindrome(line));

	}

	private static boolean isPalindrome(String line) {
		String rep = "[^a-zA-Z0-9]";
		line = line.toLowerCase().replaceAll(rep, "");
		int left = 0;
		int right = line.length() - 1;
		while (left < right) {
			if (line.charAt(left) != line.charAt(right))
				return false;

			left++;
			right--;
		}

		return true;
	}

}
