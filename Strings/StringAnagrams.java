package io.test.Strings;

public class StringAnagrams {

	public static void main(String[] args) {
		String str = new String("anagramasdsasds");
		String tar = new String("nagaramasdsasds");
		System.out.println(isAnagram(str, tar));
	}

	private static boolean isAnagram(String str, String tar) {
		if (str.length() != tar.length())
			return false;
		int[] strarr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			strarr[c - 'a']++;
		}

		int[] tararr = new int[26];
		for (int i = 0; i < tar.length(); i++) {
			char c = tar.charAt(i);
			tararr[c - 'a']++;
		}

		for (int i = 0; i < strarr.length; i++) {
			if (strarr[i] != tararr[i]) {
				return false;
			}
		}

		return true;
	}

}

/**
 * Map<Character, Integer> data = new HashMap<>(); for (char c :
 * str.toCharArray()) data.put(c, data.getOrDefault(c, 0) + 1);
 * 
 * Map<Character, Integer> data2 = new HashMap<>(); for (char c :
 * tar.toCharArray()) data2.put(c, data2.getOrDefault(c, 0) + 1);
 * 
 * for (char c : tar.toCharArray()) { if (data.get(c) != data2.get(c)) return
 * false; }
 **/
