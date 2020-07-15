
import java.util.*;

public class A1324{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){
			int n = in.nextInt();
			int arr[] = new int[n];

			for (int i = 0 ; i < n ;i++ ) {

				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			String answer = "YES";
			int max = arr[arr.length - 1 ];

			for (int i = 0; i < arr.length - 1; i++) {
				if ((max - arr[i]) % 2 != 0) {
					answer = "NO";
					break;
				}

				
			}
			System.out.println(answer);
		}
	}
}