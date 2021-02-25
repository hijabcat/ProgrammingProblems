import java.util.Scanner;
public class nearlyLuckynumber {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long x = input.nextLong();
		int count=0;
		while (x!=0) {
			if(x%10==7 || x%10==4)
				count++;
			
			x/=10;
		}
		if (count==7 || count ==4)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
 
}
