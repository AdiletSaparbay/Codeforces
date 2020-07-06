import java.util.*;
public class A327{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c1=0;
		int c0=0;
		int c0m=-1;
		for (int i=0;i<n;i++) {
			int u = s.nextInt();
			if (u==1) {
				c1++;
				if (c0>0) c0--;
			} else {
				c0++;
				if(c0>c0m) c0m=c0;
			}
		}
		System.out.println(c1+c0m);

	}
}