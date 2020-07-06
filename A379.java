import java.io.*;

public class A379{
	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s[] = in.readLine().split(" ");

		int a = Integer.parseInt(s[0]), b = Integer.parseInt(s[1]);

		int t = a;
		int mod = 0;

		while(a >= b){
			mod = a % b;
			a = a / b;
			t += a;
			a += mod;
		}
		
		System.out.println(t);		
	}
}