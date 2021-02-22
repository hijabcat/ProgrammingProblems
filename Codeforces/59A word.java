import java.util.Scanner;
public class Word {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		char ch[] = s.toCharArray();
		
		char up[]= new char [ch.length];
		int count=0;
		for (int i=0;i<up.length;i++) {
			up[i]=Character.toUpperCase(s.charAt(i));
		}
		for (int i=0;i<ch.length;i++) {
			if (ch[i]==up[i])
				count++;
		}
		if (count>(s.length()/2))
			System.out.print(s.toUpperCase());
		else
			System.out.print(s.toLowerCase());
		
 
	}
 
}
