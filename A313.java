import java.util.*;

public class A313{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		if (a >= 0)	 {
			System.out.println(a);
		}
		else{
			int min = a / 10;
			int min2 = a / 100 * 10 + a % 10;
			System.out.println(Math.max(min,min2));
		}
	}
}