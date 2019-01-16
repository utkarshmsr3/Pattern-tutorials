/*
1
232
34543
4567654
567898765
*/

import java.util.Scanner;

class Pattern7 {
	public static void main(String args[]) {	

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();



		for(int i=1;i<=num;i++) {
			for(int j=i;j<=2*i-1;j++)
				System.out.print(j);
			for(int j=2*i-2;j>=i;j--)
				System.out.print(j);
			System.out.println();
		}
	}
}
	