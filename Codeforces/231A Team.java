import java.util.Scanner;
public class Team {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a = input.nextInt();
		
		int count2 = 0;
		
		for (int i=0;i<a;i++) {
			int count = 0;
			int [] b = new int[3];
			for (int j=0;j<b.length;j++) {
				b[j] = input.nextInt();	
			}
			for(int d=0;d<b.length;d++) {
				if (b[d]==1)
					count+=1;
			}
			if(count>1)
				count2+=1;
		}
		System.out.print(count2);
	}

}
