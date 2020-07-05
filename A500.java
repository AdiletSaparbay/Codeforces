import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

public class A500{
	public static void main(String[] args) {
		solve();
	}

	static void solve(){
		FastReader in = new FastReader();
		int n = in.nextInt(), t = in.nextInt();
		//int count = 0;
		String answer = "NO";
		int arr[] = new int[n];
		for (int i = 1; i < n ;i ++ ) {
			int a = in.nextInt();
			 arr[i] = a;
		}
		for (int i = 1;i < n ;i++ ) {
			int tel = i + arr[i];
			if(tel == t){
				answer = "YES";
				break;
			}
			i = tel - 1;
		}
		System.out.print(answer);
	}

	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 

}