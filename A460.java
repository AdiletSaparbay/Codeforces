import java.util.*;

public class A460{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), m = in.nextInt();
		int t = 0;
		int j = 1;
		for (int i = 1; i <=n; i++) {
			t++;
			if (i == j * m) {
				n++;
				j++;
			}
			
		}
		System.out.print(t);
	}
}