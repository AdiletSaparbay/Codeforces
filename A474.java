import java.util.*;

public class A474{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		String str = in.next();
		String qw = "qwertyuiopasdfghjkl;zxcvbnm,./";
		int pos = 0;
		if (s.equals("R")) {
			pos = - 1;
		}
		else{
			pos = 1;
		}
		for (int i = 0; i < str.length();i++ ) {
			int position = pos + qw.indexOf(str.charAt(i)+"");
			if (position > qw.length() - 1) {
				position = 0;
			}
			if (position < 0) {
				position = qw.length() - 1;
				
			}
			System.out.print(qw.charAt(position));

		}

	}
}