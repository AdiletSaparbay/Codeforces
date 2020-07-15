import java.util.*;

public class A124{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();

		System.out.println(Math.min(n - a,b + 1));
	}
}