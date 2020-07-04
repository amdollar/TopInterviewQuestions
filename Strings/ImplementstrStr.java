package io.test.Strings;

public class ImplementstrStr {

	public static void main(String[] args) {
		String str = new String("mississippi");
		String needle = new String("issip");
		System.out.println(strStr(str, needle));
	}

	public static int strStr(String haystack, String needle) {
		if (needle.isEmpty())
			return 0;

		int pointer1 = 0;
		int pointer2 = 0;
		for (int i = 0; i < haystack.length(); i++) {
			pointer1 = i;
			pointer2 = 0;
			while (pointer1 < haystack.length() && pointer2 < needle.length()
					&& haystack.charAt(pointer1) == needle.charAt(pointer2)) {
				pointer1++;
				pointer2++;

			}
			if (pointer2 == needle.length())
				return i;
		}
		return -1;
	}
}
