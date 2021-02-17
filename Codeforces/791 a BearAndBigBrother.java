import java.util.Scanner;
public class BearAndBigBrother {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a=input.nextInt();
		int b=input.nextInt();		
		int count=0;
		
		while(a<=b) {
			a*=3;
			b*=2;
			count++;
		}
		System.out.print(count);
 
	}
 
}
