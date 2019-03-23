package serach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 二分法查找
 * <1>先排序
 * <2>再查找
 * @author Administrator
 *
 */
public class binary {

	public static void main(String[] args) {
		
		binary(2);
	}

	private static void binary(int i) {
		int[] number = {9,2,2,4,6,3,7,8};
		Arrays.sort(number);
		System.out.println(number[0]);
		int low = 0;
		int heigh = number.length;
		int index= -1 ;
		while(low<=heigh) {
			index = (low+heigh)/2;
			if(number[index] >i) {
				heigh = index-1;
			}else if(number[index] < i ) {
				low = index+1;
			}
		}

		System.out.println(number[index]);
	}
	

}
