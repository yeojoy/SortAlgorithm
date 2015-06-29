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
			while (array[i] < pivot) {
				if (i > j) {
					break;
				}
				
				i++;
				if (i == pivotIndex && i < (right - 1)) i++;

				
			}
			
			while (pivot < array[j] && i <= j) {
				if (i > j) break;
				
				j--;
				if (j == pivotIndex && j > (left + 1)) j--;
				
			}
			
			if (i <= j) {
				swap(i, j, array);
				i++;
				if (i == pivotIndex && i < (right - 1)) i++;
				j--;
				if (j == pivotIndex && j > (left + 1)) j--;
				
				CommonUtils.printArray(array);
			} else {
				if (pivotIndex > i) {
					swap(pivotIndex, i + 1, array);
					pivotIndex = i + 1;
				} else {					
					swap(pivotIndex, i - 1, array);
					pivotIndex = i - 1;
				}
				System.out.println("Changed Pivot Index : " + pivotIndex);
				CommonUtils.printArray(array);
			}
		}
		
		if (left < pivotIndex)
			quickSort(left, pivotIndex - 1, array);
		if (pivotIndex < right)
			quickSort(pivotIndex + 1, right, array);
		
	}	
	
	private void swap(int i, int j, int[] array) {
		
		System.out.println(array[i] + "와(과) " + array[j] + "을(를) 변경.");
		System.out.println();
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
