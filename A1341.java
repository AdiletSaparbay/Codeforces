import java.util.*;

public class A1341{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){


			int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();

			int minz = a - b;
			int maxz = a+ b;
			int minp = c - d;
			int maxp = c + d;

			System.out.println(maxz * n >= minp && minz * n <= maxp ? "YES" : "NO");




		}
	}
}