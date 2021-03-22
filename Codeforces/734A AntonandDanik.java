import java.util.Scanner;
 
public class AntonDanik {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		char friends [] = input.next().toCharArray();
		int count1 = 0,count2 = 0;
		for(int i=0;i<friends.length;i++) {
			if(friends[i]=='A') 
				count1++;
			else if (friends[i]=='D')
				count2++;
		}
		if(count1>count2)
			System.out.print("Anton");
		else if(count1<count2)
			System.out.print("Danik");
		else
			System.out.print("Friendship");
 
	}
 
}
