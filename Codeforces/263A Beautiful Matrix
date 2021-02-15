import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int count =0;
		int [][]a = new int [5][5];
		int x =0;
		int y =0;
    
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				a[i][j]=input.nextInt();
			}
		}
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (a[i][j]==1) {
					x=i;
					y=j;	
				}
			}
		}
		System.out.print(Math.abs(x-2) + Math.abs(y-2));
	}

}
