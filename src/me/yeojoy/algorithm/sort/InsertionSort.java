package me.yeojoy.algorithm.sort;

import me.yeojoy.algorithm.util.CommonUtils;

public class InsertionSort implements SortInterface {

	private int[] sourceArray;
	
	public InsertionSort(int[] array) {
		sourceArray = array;
	}
	
	@Override
	public void sort() {
		CommonUtils.printArray(sourceArray);
		System.out.println("\n\n");
		int count = 0;
		
		for (int i = 1, j = sourceArray.length; i < j; i++) {
			for (int k = i; k > 0; k--) {
				count++;
				if (sourceArray[k - 1] > sourceArray[k]) {
					swap(k - 1, k, sourceArray);
				} else
					break;
			}

			CommonUtils.printArray(sourceArray);
		}
		
		CommonUtils.validateArray(sourceArray, count);
		
	}
	
	private void swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
