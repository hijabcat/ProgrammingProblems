import java.util.Scanner;
public class NextRound {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int totalParticipant = input.nextInt();
		int placeFinisher = input.nextInt();
		int [] participant = new int [totalParticipant];
		
		for (int i=0;i<participant.length;i++) {
			participant[i]=input.nextInt();
		}
		nextRound(participant,placeFinisher);
	}
	public static void nextRound(int [] participant, int place) {
		
		int max=participant[place-1];
		int count=0;
		for (int i=0;i<participant.length;i++) {
			
			if (participant[i]>=max && participant[i]>0) 
				count++;
		}
		System.out.print(count);
	}

}
