import java.util.Scanner;
public class Tram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int max=0;
		int sum=0;
		for(int i=0;i<a;i++) {
			int temp=-input.nextInt()+input.nextInt();
			sum+=temp;
			if(max<sum) 
				max=sum;
		}
		System.out.print(max);
	}

}
