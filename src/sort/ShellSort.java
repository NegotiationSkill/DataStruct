package sort;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] num = {8,6,3,5,9,2,0};
		sort(num);
		System.out.println(Arrays.toString(num));
	}
	public static void sort(int[] num) {
		int d = num.length/2;
		while(d>0) {
			//��������ĺ�һ����
			for(int i = d;i<num.length;i++) {
				
				//Ѱ�Һ��Լ�ͬ�����
				for(int j = i-d;j>=0;j-=d) {
					if(num[j]>num[j+d]) {
						int temp = num[j];
						num[j] = num[j+d];
						num[j+d] = temp;
					}
				}
			}
			
			
			d=d/2;
		}
	}
		
		
	
}
