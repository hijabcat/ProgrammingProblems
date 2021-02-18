import java.util.Scanner;
public class Elephant {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int count=0;
		while(a!=0) {
			for (int i=5;i>0;i--) {
				while(a-i>=0) {
					a=a-i;
					count++;
					
				}
			}
		}
		System.out.print(count);
		
	}
}
