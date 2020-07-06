import java.util.*;

public class A270{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int a = in.nextInt();
			double answer = (double)360/(180 - a);
			if (answer == (int)answer) {
			 	System.out.println("YES");
			 } 
			 else{
			 	System.out.println("NO");
			 }
		}
	}
}