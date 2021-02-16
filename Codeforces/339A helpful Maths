import java.util.Scanner;
public class helpfulMaths {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str=new String(input.next());
		
		str = str.replaceAll("[^0-9]","");
		char temp;
		char chars[] = str.toCharArray();
		
		//bubble sort
		for (int i=0;i<chars.length;i++) {
			for (int j=1;j<(chars.length-i);j++) {
				if (chars[j-1]>chars[j]) {
					temp=chars[j-1];
					chars[j-1]=chars[j];
					chars[j]=temp;
				}
			}
		}
		for (int i=0;i<chars.length;i++) {
			if (i<chars.length-1)
				System.out.print(chars[i] + "+");
			else
				System.out.print(chars[i]);
		}
		
	}

}
