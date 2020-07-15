import java.util.*;

public class B34{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), m = in.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			
		}
		Arrays.sort(arr);

		int sum  = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (count >= m) {
				break;
			}
			if (arr[i] < 0) {
				sum += Math.abs(arr[i]);
				count++;
				
			}
			else{
				break;
			}
		}
		System.out.println(sum);
	}
}