
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

public class B474{
	public static void main(String[] args) {
		FastReader in = new FastReader();

		int m = in.nextInt();
		int a[] = new int[m + 1];
		a[0] = 0;
		a[1] = in.nextInt();
		for (int i = 2; i <= m; i++) {
			int n = in.nextInt();
			a[i] = a[i - 1] + n; 

		}
		int t = in.nextInt();
		
		while(t-->0){
			int q = in.nextInt();
			System.out.println(bs(a,q));
		}
	}
	static int bs(int arr[],int x){
		int l = 1,r = arr.length - 1;
		while(l<=r){
			int mid = l +(r - l)/2;
			if (arr[mid - 1] + 1 <= x && x <= arr[mid]){
				return mid;
			}
			if (arr[mid] < x){
				l = mid + 1;
				
			}
			else{
				r = mid - 1;
			}
			
			//System.out.println(mid);

		 }
		 return  - 1;


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