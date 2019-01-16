/*
1 2 3 4 5
2 1 2 3 4
3 2 1 2 3
4 3 2 1 2
5 4 3 2 1
*/

import java.util.Scanner;

class Pattern5 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();



		for(int i=1;i<=num;i++) {
			for(int j=i;j>=2;j--)
				System.out.print(j+" ");
			for(int j=1;j<=num-i+1;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}			
}