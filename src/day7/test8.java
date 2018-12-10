package day7;

import java.util.Arrays;

public class test8 {
	public static void main(String[] args) {
		int[] arr = {16,25,9,23,90}; 
		System.out.println("≈≈–Ú«∞£∫" + Arrays.toString(arr));
			for (int i = 0; i < arr.length - 1; i++) {
			int min =i;
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println("≈≈–Ú∫Û£∫" + Arrays.toString(arr));
	}
}
