package sort;

import java.util.Arrays;

public class QuickSort {
/**
 * ��������
 * @param args
 */
	public static void main(String[] args) {
		int[] num = {3,2,1,5,0,8};
		sort(num,0,num.length-1);
		System.out.println(Arrays.toString(num));
	}
	public static void sort(int[] number,int start,int end) {		
		if(start<end) {
			//1.ѡ����׼ֵ�����ڱ�׼ֵ�ķ��ڱ�׼ֵ֮��С�ڱ�׼ֵ�ķ��ڱ�׼ֵ֮ǰ��һ��Ĭ��ѡ��ʼֵ
			int standard = number[start];
			int low = start;
			int high = end;
			while(low < high) {
				while(high>low && number[high]>standard) {
					high--;
				}
				number[low] = number[high];
				while(high>low && number[low]<standard) {
					low++;
				}
				number[high] = number[low];
			}
			number[low] = standard;
			
			sort(number,start,low);
			sort(number,low+1,end);
		}
	}
	
}
