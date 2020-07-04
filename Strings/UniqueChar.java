package io.test.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return its
 * index. If it doesn't exist, return -1.
 *
 */
public class UniqueChar {

	public static void main(String[] args) {
		String str = new String("dddccdbba");
		System.out.println(firstUniqChar(str));

	}

	public static int firstUniqChar(String s) {
		Map<Character, Integer> data = new HashMap<>();

		for (char c : s.toCharArray())
			data.put(c, data.getOrDefault(c, 0) + 1);

		for (int i = 0; i < s.length(); i++) {
			int fre = data.get(s.charAt(i));
			if (fre == 1) {
				return i;
			}
		}
		return -1;
	}

}
