import java.util.*;

public class A1343{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){

			int n = in.nextInt();

			int i = 2;
			int sum = 1;
			while(true){
				sum += Math.pow(2,i -1);

				if (n % sum == 0) {
					System.out.println(n / sum);
					break;
				}
				i++;

			}
		
		}
	}
}