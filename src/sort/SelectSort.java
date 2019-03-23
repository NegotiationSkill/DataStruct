package sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] num = {8,6,3,5,9,2,0};
		sort(num);
		System.out.println(Arrays.toString(num));
	}

	private static void sort(int[] num) {
		
		
		for(int j = 0;j<num.length-1;j++) {
			int min = num[j];
			int index = j;
			for(int i =j+1;i<num.length;i++) {
				if(num[i]<min) {
					min = num[i];
					index = i;
				}
			}
			int temp = num[j];
			num[j] = min;
			num[index] = temp;
		}
		
	}

}
