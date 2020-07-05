import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 


public class A466{
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		Scanner s = new Scanner (System.in);
		int N=s.nextInt(),M=s.nextInt(),A=s.nextInt(),B=s.nextInt();
		System.out.println(Math.min(Math.min(A*N, B*(N/M)+ A*(N%M)),B*((N+M-1)/M)));
	}
}
	

