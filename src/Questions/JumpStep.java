package Questions;
/**
 * 青蛙跳台阶问题  青蛙可以一步跳1  或 2 个台阶，n个台阶多少种跳法
 * @author Administrator
 *
 */
public class JumpStep {
	static int  count = 0;
	public static void main(String[] args) {
		int n = 5;
		System.out.println(jump(n));
	}

	private static int jump(int n) {
		
		if(n == 1 ) {
			return count++;
		}else if(n ==2 ) {
			return count=count+2;
		}
		jump(n-1);
		jump(n-2);
		
		return count;
		
	}

}
