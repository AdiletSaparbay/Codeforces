import java.util.*;

public class A588{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n];
		int p[] = new int[n];


		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			p[i] = in.nextInt();
		}
		int money = 101;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			money = Math.min(money,p[i]);

			ans += money * a[i];
		}
		System.out.println(ans);




	}
}