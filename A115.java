import java.util.Scanner;
 
public class A115{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num+1];
		for (int i=1; i<=num; i++) {
			arr[i]=in.nextInt();
		}
 
		int res = 1;
 
		for (int i=1; i<=num; i++) {
			int at = arr[i];
			int count = 1;
			while(at!=-1) {
				at = arr[at];
				count++;
			}
			res = Math.max(res,count);
		}
 
		System.out.println(res);
	}
}