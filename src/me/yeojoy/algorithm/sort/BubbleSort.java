package me.yeojoy.algorithm.sort;

public class BubbleSort implements SortInterface {

	private int[] sourceArray;
	
	public BubbleSort(int[] array) {
		sourceArray = array;
	}
	
	@Override
	public void sort() {
		CommonUtils.printArray(sourceArray);
		
		int swapCallCount;
		for (int i = 0, j = sourceArray.length; i < j; i++) {
			swapCallCount = 0;
						
			for (int k = 0, l = (j - i - 1); k < l; k++) {
				if (sourceArray[k] > sourceArray[k + 1]) {
					
					swap(k, k + 1, sourceArray);
					
					swapCallCount++;
				}
			}
			
			CommonUtils.printArray(sourceArray);
			
			if (swapCallCount == 0) {
				System.out.println((i + 1) + "번째에서 완료했습니다.");
				break;
			}
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
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
