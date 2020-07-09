import java.util.*;

public class A556{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int zero = 0;
		int one = 0;
		String s = in.next();
		for (int i = 0; i < n; i++) {
			//System.out.println(s.charAt(i));
			if (s.charAt(i) == '0') {
				zero++;
			}
			else{
				one++;
			}
		}
		System.out.println(n - Math.min(one,zero) * 2);

	}
}