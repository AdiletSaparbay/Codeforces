import java.util.Scanner;
public class A577{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), x = in.nextInt();
		int count = 0;
		for (int i = 1; i <=n; i++) {
			if (x % i == 0 && x / i <=n) {
				count++;
				
			}
		}
		System.out.print(count);
	}
}