import java.util.*;
public class A1342{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			long x = in.nextLong(), y = in.nextLong();
			long a = in.nextLong(), b = in.nextLong();
			long sum = 0;
			long mins = Math.abs(x - y);
			long min = Math.min(x,y);
			if (a * 2 > b) {
				sum = min * b;
			}
			else{
				sum = min * a * 2;
			}
			sum += mins * a;
			System.out.println(sum);

		}
	}
}