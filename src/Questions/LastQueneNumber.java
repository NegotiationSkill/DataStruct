package Questions;
/**
 * 求出一个整数串中最大的连续上升子串
 * @author Administrator
 *
 */
public class LastQueneNumber {

	public static void main(String[] args) {
		int[] parentNumber = {2,8,6,3,10,85,102,48,63};
		System.out.println(resolve(parentNumber));
	}

	private static int resolve(int[] parentNumber) {
		int result = 0;
		for(int i =0;i<parentNumber.length-1;i++){
			int count = 0;
			for(int j =i+1;j<parentNumber.length;j++) {
				if(parentNumber[j]>parentNumber[j-1]) {
					count++;
				}
			}
			if(count == parentNumber.length-1) {
				return count;
			}
			if(count > result) {
				result = count;
			}
		}
		return result;
	}
	

}
