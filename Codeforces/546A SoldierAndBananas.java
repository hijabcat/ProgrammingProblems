import java.util.Scanner;
public class SoldierAndBananas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int banana=input.nextInt();
		int money=input.nextInt();
		int wants=input.nextInt();
		int sum=0;
		
		for (int i=1;i<=wants;i++) {
			sum+=banana*i;
		}
		int borrow = money-sum;
		if(borrow>0)
			System.out.print(0);
		else
			System.out.print(Math.abs(borrow));
	}

}
