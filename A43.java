import java.util.*;

public class A43{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String s[] = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = in.next();

		}
		Arrays.sort(s);
		String winner = s[0];
		int max = 1;
		int count = 1;
		for (int i = 0; i < n - 1; i++) {
			if (s[i].equals(s[i + 1])) {
				count++;
				if (max < count) {
					max = count;
					winner = s[i];
					
				}
			}
			else{
				count = 1;
			}
		}
		System.out.print(winner);
	}
}