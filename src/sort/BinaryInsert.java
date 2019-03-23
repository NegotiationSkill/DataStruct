package sort;

import java.util.Arrays;

public class BinaryInsert {

	public static void main(String[] args) {
		int[] num = {3,10,1,6,8,9};
		sort(num);
		System.out.println(Arrays.toString(num));

	}

	private static void sort(int[] num) {
		
		for(int i = 1;i<num.length;i++) {
			int low = 0;
			int high = i-1;
			int temp = num[i];
			
			while(low<=high) {
				int mid = (high+low)/2;
				if(num[mid]<temp) {
					low = mid+1;
				}else {
					high=mid-1;
				}
			}
			
			int j = i-1;
			while(j>=low) {
				num[j+1]=num[j];
				j--;
			}
			num[low] = temp;   
		} 
		
	}

}
