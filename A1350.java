import java.util.*;

public class A1350{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){

			int n = in.nextInt(), k = in.nextInt();
			
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					n +=i;
					break;
				}
			}
			n += (k - 1) * 2;

			System.out.println(n);

		}
	}
}