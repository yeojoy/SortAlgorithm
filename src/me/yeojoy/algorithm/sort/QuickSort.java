package me.yeojoy.algorithm.sort;

import me.yeojoy.algorithm.util.CommonUtils;

public class QuickSort implements SortInterface {

	private int[] sourceArray;
	
	public QuickSort(int[] array) {
		sourceArray = array;
	}
	
	@Override
	public void sort() {
		CommonUtils.printArray(sourceArray);
		System.out.println("\n");

		quickSort(0, sourceArray.length - 1, sourceArray);
		
		CommonUtils.validateArray(sourceArray, 0);
	}
	
	private void quickSort(int i, int j, int[] array) {
		
		
	}
	
	private void swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
