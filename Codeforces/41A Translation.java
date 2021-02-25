import java.util.Scanner;
public class Translation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s1 = input.next();
		String s2 =input.next();
		int count =0;
		
		
		for (int i=0;i<s1.length();i++) {
			if(s1.length()!=s2.length()) {
				break;
			}
			if(s1.charAt(i)==s2.charAt((s2.length()-1)-i))
				count++;
		}
		if(count==s1.length())
			System.out.print("YES");
		else
			System.out.print("NO");

	}

}
