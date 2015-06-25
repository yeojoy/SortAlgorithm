package me.yeojoy.algorithm;

import java.util.Random;

import me.yeojoy.algorithm.sort.BubbleSort;
import me.yeojoy.algorithm.sort.InsertionSort;
import me.yeojoy.algorithm.sort.SelectionSort;
import me.yeojoy.algorithm.sort.SortInterface;

public class SortAlgorithmTestDrive {
	
	private static final int LENGTH = 15;
	
	/** 랜덤으로 생성한 배열 */
	private int[] sourceArray1 = new int[LENGTH];
	/** 1에서 LENGTH로 생성한 배열 */
	private int[] sourceArray2 = new int[LENGTH];
	/** LENGTH 에서 1로 생성한 배열 */
	private int[] sourceArray3 = new int[LENGTH];
	
	public static void main(String[] args) {
		SortAlgorithmTestDrive sort = new SortAlgorithmTestDrive();
		sort.init();
		
		sort.run();
	}
	
	private void init() {
		Random random = new Random();
		for (int i = 0; i < LENGTH; i++) {
			sourceArray1[i] = random.nextInt(1000);		
			sourceArray2[i] = i + 1;		
			sourceArray3[i] = LENGTH - i;		
			
		}
	}
	
	private void run() {
		
		// 삽입 정렬
		System.out.println("삽입정렬 - 랜덤");
		SortInterface sort = new InsertionSort(sourceArray1.clone());
		sort.sort();
		System.out.println("삽입정렬 - 순차");
		sort = new InsertionSort(sourceArray2.clone());
		sort.sort();
		System.out.println("삽입정렬 - 역순차");
		sort = new InsertionSort(sourceArray3.clone());
		sort.sort();

		// 버블 정렬
		System.out.println("버블정렬 - 랜덤");
		sort = new BubbleSort(sourceArray1.clone());
		sort.sort();
		System.out.println("버블정렬 - 순차");
		sort = new BubbleSort(sourceArray2.clone());
		sort.sort();
		System.out.println("버블정렬 - 역순차");
		sort = new BubbleSort(sourceArray3.clone());
		sort.sort();
		
		// 선택정렬
		System.out.println("선택정렬 - 랜덤");
		sort = new SelectionSort(sourceArray1.clone());
		sort.sort();
		System.out.println("선택정렬 - 순차");
		sort = new SelectionSort(sourceArray2.clone());
		sort.sort();
		System.out.println("선택정렬 - 역순차");
		sort = new SelectionSort(sourceArray3.clone());
		sort.sort();
		
	}
}
