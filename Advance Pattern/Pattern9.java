/*
1       2       3       4       5       6       7
24                                              8
23                                              9
22                                              10
21                                              11
20                                              12
19      18      17      16      15      14      13
*/

import java.util.Scanner;

class Pattern9 {
	public static void main(String args[]) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
			System.out.print(i+"\t");

		System.out.println();

		for(int i=1;i<=n-2;i++) {	
			System.out.print(4*n-4-i+1);
			for(int j=1;j<=n-2;j++)
				System.out.print("\t");
			System.out.print("\t"+(n+i)+"\n");
		}
			

		for(int i=3*n-2;i>=2*n-1;i--)
			System.out.print(i+"\t");
	}
}
	
			