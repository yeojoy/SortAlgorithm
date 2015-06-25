package me.yeojoy.algorithm.sort;

public class CommonUtils {
	public static void printArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0, j = array.length; i < j; i++) {
			
			sb.append(String.valueOf(array[i]));
			
			if (i != (j - 1))
				sb.append(", ");
		}
		System.out.println(sb.toString());
	}
}
