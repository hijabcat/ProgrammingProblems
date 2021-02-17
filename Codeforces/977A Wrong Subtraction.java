import java.util.Scanner;
public class WrongSubtraction {
 
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a =input.nextInt();
		int b = input.nextInt();
		while(b!=0) {
			int temp=a;
			temp%=10;
			if(temp>0)
				a-=1;
			else
				a/=10;
			
			b--;
		}
		System.out.print(a);
 
	}
 
}
