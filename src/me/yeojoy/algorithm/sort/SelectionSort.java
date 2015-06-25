package me.yeojoy.algorithm.sort;

import me.yeojoy.algorithm.util.CommonUtils;

public class SelectionSort implements SortInterface {

	private int[] sourceArray;
	
	public SelectionSort(int[] array) {
		sourceArray = array;
	}
	
	@Override
	public void sort() {
		CommonUtils.printArray(sourceArray);
		System.out.println("\n");
		
		int count = 0;
		
		for (int i = 0, j = sourceArray.length; i < j; i++) {
			
			int maxValueIndex = 0;
			
			for (int k = 1, l = (j - i); k < l; k++) {
				count++;
				if (sourceArray[maxValueIndex] < sourceArray[k]) {
					maxValueIndex = k;
				}
			}
			
			swap(maxValueIndex, j - i - 1, sourceArray);
			
			CommonUtils.printArray(sourceArray);
			
		}
		
		CommonUtils.validateArray(sourceArray, count);
	}
	
	private void swap(int i, int j, int[] array) {
		try {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("i : " + i);
			System.out.println("j : " + j);
			
			System.out.println(e.getMessage());
			
			return;
		}
	}
}
