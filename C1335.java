import java.util.*;

public class C1335{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[in.nextInt() - 1]++;
			}
			int dif = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] != 0) {
					dif++;
				}
			}
			dif--;
			Arrays.sort(arr);
			int max = arr[n - 1];
			if(max - 1 >= dif + 1) {
				dif++;
				max--;
			}
			System.out.println(Math.min(dif,max));

		}
	} 
}