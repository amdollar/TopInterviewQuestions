package io.test.Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoArrays { 

	public static void main(String[] args) {
		int[] ar1 = new int[] { 4, 9, 5 };
		int[] ar2 = new int[] { 9, 4, 9, 8, 4 };
		int res[] = intersect(ar1, ar2);
		for (int i : res) 
			System.out.print(i + " ");
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i]))
				map.put(nums1[i], map.get(nums1[i]) + 1);
			else
				map.put(nums1[i], 1);
		}
 
		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				result.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}

		int[] r = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			r[i] = result.get(i);
		}

		return r;
	}
}
