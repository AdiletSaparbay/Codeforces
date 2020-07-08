import java.util.*;

public class A318{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long n = in.nextLong(), m = in.nextLong();

		long mid = (n - 1) / 2  +  1;

		System.out.println(mid >= m   ? (m - 1) * 2 + 1 : (m - mid) * 2);
		
	}
}