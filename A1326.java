import java.util.*;
import java.math.BigInteger; 


public class A1326{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){

			int n = in.nextInt();

			BigInteger s = new BigInteger("10");

			String answer = "" + 2;
			System.out.println(n == 1 ? -1 : answer + ((s.pow(n - 1)).subtract(new BigInteger("1"))).toString());
		}
	}
}