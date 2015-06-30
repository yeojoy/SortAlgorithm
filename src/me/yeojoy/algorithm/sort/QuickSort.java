package me.yeojoy.algorithm.sort;

import java.util.HashMap;
import java.util.Random;

import me.yeojoy.algorithm.util.CommonUtils;

public class QuickSort implements SortInterface {

	private int[] sourceArray;
	
	private HashMap<Integer, Integer> alreadySorted = new HashMap<Integer, Integer>();
	
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
		
		while (i < j) {
			// 왼쪽에서 부터 큰수 검색
			while (array[i] < pivot) {
				i++;
				// pivot위치이면 이동
				if (i == pivotIndex && i < right) i++;
				
				// j를 넘어가면 멈춤
				if (i >= j) {
					// right을 넘어가면 right을 i에 넣어줌
					if (i > right) i = right;
					break;
				}
				
			}
			
			// 오른쪽에서 부터 작은 수 검색
			while (pivot < array[j]) {
				j--;
				
				// pivot 위치에 가면 한 칸 더 이동
				if (j == pivotIndex && j > left) j--;
				
				// i를 넘어가면 멈춤
				if (i >= j) {
					// left를 넘어가면 left를 j에 넣어줌
					if (j < left) j = left;
					break;
				}
			}
			
			// array[i]와 array[j]위치가 바꿔야할 위치(i < j)일 때 변경해 주
			if (i < j) {
				swap(i, j, array);
				
				// swap을 하고 다시 한 칸씩 이동시켜 줌.
				i++;
				j--;
				// pivot을 지난다면 한칸씩 더 움직임
				if (i == pivotIndex && i < (right - 1)) i++;
				if (j == pivotIndex && j > (left + 1)) j--;
				
			} 
			
			// 
			if (i >= j){
				if (array[pivotIndex] > array[i]) {
					if ((i + 1) >= right) {
						swap(pivotIndex, i, array);
						pivotIndex = i;
					} else {
						swap(pivotIndex, i, array);
						pivotIndex = i;
					}
				} else {					
					if ((i - 1) < left) {
						swap(pivotIndex, i, array);
						pivotIndex = i;
						
					} else {
						swap(pivotIndex, i - 1, array);
						pivotIndex = i - 1;
						
					}
					
					
				}
				System.out.println();
				System.out.println("Changed Pivot Index : " + pivotIndex);
				alreadySorted.put(pivotIndex, array[pivotIndex]);
			} 
			
			CommonUtils.printArray(array);
		}
		
		if (left < pivotIndex)
			quickSort(left, pivotIndex - 1, array);
		if (pivotIndex < right)
			quickSort(pivotIndex + 1, right, array);
		
	}	
	
	private void swap(int i, int j, int[] array) {
		
		System.out.println();
		System.out.println(array[i] + "와(과) " + array[j] + "을(를) 변경.");
		System.out.println();
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}	
}
