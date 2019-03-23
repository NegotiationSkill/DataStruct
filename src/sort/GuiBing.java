package sort;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 *归并：先分再合    
 */
public class GuiBing {

	public static void main(String[] args) {
		//int[] num = {8,6,3,5,9,2,0};
		int[] num = {3,1};
		merage(num,0,num.length/2,num.length-1);
		//sort(num);
		System.out.println(Arrays.toString(num));
	}
	

	private static void sort(int[] num,int low,int high) {
		int middle = (low+high)/2;
		System.out.println(middle);
		if(low<high) {
			//分左边
			sort(num,low,middle);
			//分右边
			sort(num,middle+1,high);
			//将两边合并
			merage(num,low,middle,high);
		}
		
	}
	
	
	/**
	 * 合并法：合并理论上是两个数组合并实际是一个，以middle为界限，以low和high为边界
	 * @param num
	 * @param low
	 * @param middle
	 * @param high
	 */
	private static void merage(int[] num ,int low,int middle,int high) {
		int[] result = new int[high-low+1];  //合并后的数组
		int i = low;
		int j = middle+1;
		int target = 0;
		//开始合并
		while(i<=middle && j<=high) {
			if(num[i]<num[j]) {
				result[target] = num[i];
				i++;
			}else {
				result[target] = num[j];
				j++;
			}	
			target++;
		}
		for(;i<=middle;i++,target++) {
			result[target] = num[i];
		}
		for(;j<=high;j++,target++) {
			result[target] = num[j];
		}
		target--;
		for(;target>=0;target--,high--) {
			num[high] = target;
		}
	}
}
