package me.yeojoy.algorithm.util;

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
	
	public static void validateArray(int[] array, int count) {
		boolean isValid = true;
		for (int i = 0, j = array.length - 1; i < j; i++) {
			if (array[i] > array[i + 1]) {
				isValid = false;
				break;
			}	
		}
		
		System.out.println();
		System.out.println();
		// 최종 배열 출력
		printArray(array);
		System.out.println();
		System.out.println();
		// 정렬한 배열이 유효한 지 확인
		if (isValid) {
			System.out.println("Congraturations!");
			if (count > 0) System.out.println(count + "번 연산.");
		} else {
			System.out.println("The array is not valid.");			
		}
		System.out.println();
		System.out.println();
	}
}
