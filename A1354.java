import java.util.*;

public class A1354{
public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		long t = obj.nextLong();
		while (t-- > 0) {
			Long a = obj.nextLong();
			Long b = obj.nextLong();
			Long c = obj.nextLong();
			Long d = obj.nextLong();
			if (b >= a)
				System.out.println(b);
			else {
				if (d >= c)
					System.out.println(-1);
				else
					System.out.println(((a - b + c - d - 1) / (c - d)) * (long) c + b);
			}
		}
	}
}