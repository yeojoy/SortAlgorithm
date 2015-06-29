package me.yeojoy.algorithm.sort;

import java.util.Random;

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
	
	private void quickSort(int left, int right, int[] array) {

		int i = left;
		int j = right;
		int pivotIndex = left + (right - left) / 2;
		int pivot = array[pivotIndex];
		System.out.println();
		System.out.println(String.format("Left, Pivot, Right : %d, %d, %d. Pivot : %d", left, pivotIndex, right, pivot));
		
		while (i <= j) {
			while (array[i] < pivot)
				i++;
			
			while (pivot < array[j])
				j--;
			
			if (i <= j) {
				swap(i, j, array);
				i++;
				j--;
				
				CommonUtils.printArray(array);
			}
		}
		
		if (left < j)
			quickSort(left, j, array);
		if (i < right)
			quickSort(i, right, array);
		
	}	
	
	private void swap(int i, int j, int[] array) {
		
		System.out.println(array[i] + "와(과) " + array[j] + "을(를) 변경.");
		System.out.println();
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
