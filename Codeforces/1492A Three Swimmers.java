import java.util.*;
public class ThreeSwimmers {
 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int cases = input.nextInt();
		for(int i=0;i<cases;i++) {
			
			long p = input.nextLong();
			long a = input.nextLong();
			long b = input.nextLong();
			long c = input.nextLong();
			
			long na = (a*((p/a)+(p%a == 0 ? 0 : 1)));
			long nb = (b*((p/b)+(p%b == 0 ? 0 : 1)));
			long nc = (c*((p/c)+(p%c == 0 ? 0 : 1)));
			
			System.out.println(Math.min(Math.min(na, nb), nc)-(long)p);
		}
	}
}
