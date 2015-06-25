package me.yeojoy.algorithm.sort;

public class SelectionSort implements SortInterface {

	private int[] sourceArray;
	
	public SelectionSort(int[] array) {
		sourceArray = array;
	}
	
	@Override
	public void sort() {
		CommonUtils.printArray(sourceArray);
		
		for (int i = 0, j = sourceArray.length; i < j; i++) {
			
			int maxValueIndex = 0;
			
			for (int k = 1, l = (j - i); k < l; k++) {
				if (sourceArray[maxValueIndex] < sourceArray[k]) {
					maxValueIndex = k;
				}
			}
			
			swap(maxValueIndex, j - i - 1, sourceArray);
			
			CommonUtils.printArray(sourceArray);
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		CommonUtils.printArray(sourceArray);
		System.out.println();
		System.out.println();
		System.out.println();
		
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
