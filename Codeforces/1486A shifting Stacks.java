import java.util.Scanner;
public class ShiftingStacks {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a =input.nextInt();
		for (int i=0;i<a;i++) {
			int b = input.nextInt();
			long newArray[] = new long[b];
				for(int j=0;j<b;j++) 
					newArray[j]=input.nextInt();
				System.out.println(shiftingStacks(b,newArray));
		}
	}
	public static String shiftingStacks(int b,long newArray[]) {
		long sum=0;
		
		for(int i=0;i<b;i++) {
			sum+=newArray[i];
			if (sum<i*(i+1)/2)
				return "NO";
		}
		return "YES";
	}
	
 
}
