import java.util.Scanner;
public class Watermelon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value = input.nextInt();
		
		if (value >2 && value%2==0)
			System.out.print("YES");
		else
			System.out.print("NO");
	}

}
