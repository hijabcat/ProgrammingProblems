import java.util.Scanner;
public class StonesOnTheTable {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		
		 char chars [] = new char [n];
		
		chars = input.next().toCharArray();
		
		int count = 0;
		for (int i=1;i<chars.length;i++) {
			if (chars[i]==chars[i-1]) {
				count++;
			}
		}
		System.out.print(count);
	}

}
