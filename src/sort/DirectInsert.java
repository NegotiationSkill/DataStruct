package sort;

import java.util.Arrays;

public class DirectInsert {

	public static void main(String[] args) {
		int[] num = {3,1,6,8};
		sort(num);
		System.out.println(Arrays.toString(num));
	}

	private static void sort(int[] num) {
		for(int i=1;i<num.length;i++) {
			int j =i-1;
			int temp = num[i];
			
				//ÕÒÎ»ÖÃ
				while(j>=0&&num[j]>temp) {
					num[j+1] = num[j];
					j--;
				}
				
				num[j+1] = temp;
			
		
		}
	}

}
