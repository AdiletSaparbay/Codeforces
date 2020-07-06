import java.io.*;
import java.util.*;

public class B489{

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(n-->0){
			a.add(in.nextInt());
		}
		int m = in.nextInt();
		ArrayList<Integer> b = new ArrayList<Integer>();
		while(m-->0){
			b.add(in.nextInt());
		}
		Collections.sort(b);
		Collections.sort(a);
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				//System.out.println(i + " " + j);
				if (a.get(i) == b.get(j) || a.get(i) - 1 == b.get(j) || a.get(i) == b.get(j) - 1){
					count++;
					a.remove(i);
					b.remove(j);
					i = 0;
					j = -1;	
					
				}
				if (b.size() == 0 || a.size() == 0) {
					break;
				}

			}
			
		}
		System.out.println(count); 


	}
}