import java.util.Scanner;
public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					break;
				}
			}
		}
		int ans=s.length()-count;
		if(ans%2==0)
			System.out.print("CHAT WITH HER!");
		else
			System.out.print("IGNORE HIM!");
	}
}
