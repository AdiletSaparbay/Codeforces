import java.util.*;

public class B1373{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){

			String s = in.next();
			int zero = 0;
			int one = 0;

			for (int i = 0 ; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					zero++;
				}
				else{
					one++;
				}
			}
			int min = Math.min(zero,one);

			if (min % 2 == 0) {
				System.out.println("NET");
			}
			else{
				System.out.println("DA");
			}
			
		}
	}
}