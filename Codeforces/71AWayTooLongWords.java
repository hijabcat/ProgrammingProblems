import java.util.Scanner;
public class TooLongWords {

	public static void main(java.lang.String[] args) {
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		
		String wordArray[] = new String [value];
		
		for (int i=0;i<wordArray.length;i++) {
			wordArray[i]=input.next();
		}
		
		for (int i=0;i<wordArray.length;i++) {
			if (wordArray[i].length()>10) {
				System.out.print(wordArray[i].charAt(0));
				System.out.print(wordArray[i].length()-2);
				System.out.println(wordArray[i].charAt(wordArray[i].length()-1));
			}
			else
				System.out.println(wordArray[i]);
		}
	}
	

}
