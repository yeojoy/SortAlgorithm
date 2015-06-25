package me.yeojoy.algorithm.sort;

import java.util.Random;

public class SortAlgorithmTestDrive {
	
	private static final int LENGTH = 100;
	
	private int[] sourceArray = new int[LENGTH];
	
	public static void main(String[] args) {
		SortAlgorithmTestDrive sort = new SortAlgorithmTestDrive();
		sort.init();
		
		sort.run();
	}
	
	private void init() {
		Random random = new Random();
		for (int i = 0; i < LENGTH; i++) {
			sourceArray[i] = random.nextInt(1000);		
		}
	}
	
	private void run() {
		
		SortInterface sort = new BubbleSort(sourceArray.clone());
		sort.sort();
		
		sort = new SelectionSort(sourceArray.clone());		
		sort.sort();
		
	}
}
