package io.test.Strings;

public class StringtoInteger {

	public static void main(String[] args) {
		String num = new String("+2");
		System.out.println(myAtoi(num));
	}

	public static int myAtoi(String str) {
		double res = 0;
		str = str.trim();

		if (str.isEmpty() || Character.isAlphabetic(str.charAt(0)))
			return 0;
		int left = 0;
		StringBuilder num = new StringBuilder();
		if (str.length() < 2 && !Character.isDigit(str.charAt(0)))
			return 0;
		while (left < str.length()
				&& (!Character.isAlphabetic(str.charAt(left)) && !Character.isWhitespace(str.charAt(left)))) {
			num.append(str.charAt(left));
			left++;
		}

		str = num.toString();
		if (!str.isEmpty() || !str.equals("")) {
			res = Double.parseDouble(str);
			if (res > Integer.MAX_VALUE) {
				res = Math.pow(-2, 31);
			}
		}
		return (int) res;

	}
}
