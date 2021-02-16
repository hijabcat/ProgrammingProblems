import java.util.Scanner;
public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		String b = input.next();

		a = a.toLowerCase(); // change String to lowercase
		b = b.toLowerCase();
		
		int c = a.compareTo(b);
		
		if (c==0)
			System.out.print(0);
		else if (c>0)
			System.out.print(1);
		else
			System.out.print(-1);
	}

}
