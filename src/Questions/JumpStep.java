package Questions;
/**
 * ������̨������  ���ܿ���һ����1  �� 2 ��̨�ף�n��̨�׶���������
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
