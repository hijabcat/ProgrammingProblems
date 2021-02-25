import java.util.Arrays;
import java.util.Scanner;
public class Arena {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		for (int i=0;i<x;i++) {
			int n = input.nextInt();
			int arr[]= new int [n];
			for(int j=0;j<arr.length;j++) {
				arr[j]=input.nextInt();
			}
			Arrays.sort(arr);
			int min = arr[0];
			int total=0;
			for (int b=0;b<arr.length;b++) {
				if (arr[b]!=min)
					total++;
			}
			System.out.println(total);
		}
 
	}
 
}
