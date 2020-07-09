import java.util.*;

public class A149{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int k = in.nextInt();

		int sum = 0,count = 0;

		int arr[] = new int[12];

		for (int i = 0; i < 12; i++) {

			arr[i] = in.nextInt();

			sum += arr[i];
			
		}
		if (k == 0) {
			System.out.println(0);
		}
		else if (k > sum) {
			System.out.println(-1);
			
		}
		else{
			sum = 0;
			Arrays.sort(arr);
			for (int i = 11;i>=0;i-- ) {
				sum += arr[i];
				count++;
				if (sum >= k) {
					break;
					
				}

			}
			System.out.println(count);

		}
	}
}